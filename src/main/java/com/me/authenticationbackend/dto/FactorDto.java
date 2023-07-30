package com.me.authenticationbackend.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FactorDto {

    private Long id;

    private String companyName;

    private Date saleDate;

    private Long factorNumber;

    private SellerDto seller;

    private BuyerDto buyer;

    private List<CommodityDto> commodities;

    private Double totalPrice;
}
