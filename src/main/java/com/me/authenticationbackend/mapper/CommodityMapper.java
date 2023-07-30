package com.me.authenticationbackend.mapper;

import com.me.authenticationbackend.dal.entity.Commodity;
import com.me.authenticationbackend.dto.CommodityDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {

    Commodity toCommodity(CommodityDto commodityDto);

    CommodityDto toCommodityDto(Commodity commodity);

    List<Commodity> listCommodityDtoToCommodity(List<CommodityDto> commodityDtos);

    List<CommodityDto> listCommodityToCommodityDto(List<Commodity> commodities);
}
