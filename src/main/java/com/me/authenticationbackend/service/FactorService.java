package com.me.authenticationbackend.service;

import com.me.authenticationbackend.dal.entity.Factor;
import com.me.authenticationbackend.dal.repository.FactorRepository;
import com.me.authenticationbackend.dto.CommodityDto;
import com.me.authenticationbackend.dto.FactorDto;
import com.me.authenticationbackend.mapper.CommodityMapper;
import com.me.authenticationbackend.mapper.FactorMapper;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FactorService {

    private final FactorRepository factorRepository;
    private final CommodityService commodityService;

    FactorMapper factorMapper = Mappers.getMapper(FactorMapper.class);

    public String createFactor(FactorDto factorDto) {

        Factor factor = factorRepository.save(factorMapper.toFactor(factorDto));
        commodityService.addCommoditiesOfFactor(factor , factorDto.getCommodities());
        return "Factor added successfully";
    }

    public List<FactorDto> getFactors() {

        List<FactorDto> factors = factorMapper.listFactorToFactorDto(factorRepository.findAll());
        factors.forEach(factorDto -> {
            setFactorDetails(factorDto);
        });
        return factors;

    }

    private double calculateFactorTotalPrice(FactorDto factorDto) {
        double totalPrice = 0.0;
        if (factorDto.getCommodities() != null) {
            for (CommodityDto commodityDto : factorDto.getCommodities()) {
                totalPrice += commodityDto.getUnitPrice() * commodityDto.getAmount();
            }
        }
        return totalPrice;
    }

    public FactorDto getFactorByNumber(Long factorNumber) {
        Factor factor = factorRepository.findByFactorNumber(factorNumber).orElseThrow(() -> new RuntimeException("Item Not Found"));
        FactorDto factorDto = factorMapper.toFactorDto(factor);
        setFactorDetails(factorDto);
        return factorDto;
    }

    private void setFactorDetails(FactorDto factorDto) {
        factorDto.setCommodities(commodityService.getFactorCommodities(factorDto.getId()));
        factorDto.setTotalPrice(calculateFactorTotalPrice(factorDto));
    }
}
