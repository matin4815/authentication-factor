package com.me.authenticationbackend.mapper;

import com.me.authenticationbackend.dal.entity.Factor;
import com.me.authenticationbackend.dto.FactorDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FactorMapper {

    Factor toFactor(FactorDto factorDto);

    FactorDto toFactorDto(Factor factor);

    List<FactorDto> listFactorToFactorDto(List<Factor> factors);
}
