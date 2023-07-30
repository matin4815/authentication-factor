package com.me.authenticationbackend.dto;

import com.me.authenticationbackend.dal.entity.Factor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommodityDto {

    private Long id;

    private String name;

    private String description;

    private Double unitPrice;

    private Double amount;

}
