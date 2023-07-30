package com.me.authenticationbackend.service;

import com.me.authenticationbackend.dal.entity.Commodity;
import com.me.authenticationbackend.dal.entity.Factor;
import com.me.authenticationbackend.dal.repository.CommodityRepository;
import com.me.authenticationbackend.dto.CommodityDto;
import com.me.authenticationbackend.mapper.CommodityMapper;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommodityService {

    private final CommodityRepository commodityRepository;

    CommodityMapper commodityMapper = Mappers.getMapper(CommodityMapper.class);

    public void addCommoditiesOfFactor(Factor factor, List<CommodityDto> commodities) {

        List<Commodity> commodityList = commodityMapper.listCommodityDtoToCommodity(commodities);
        commodityList.forEach(commodity -> commodity.setFactor(factor));
        commodityRepository.saveAll(commodityList);

    }

    public List<CommodityDto> getFactorCommodities(Long factorId) {
        List<Commodity> commodities = commodityRepository.findAllByFactorId(factorId);
        return commodityMapper.listCommodityToCommodityDto(commodities);
    }
}
