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
public class BuyerDto {

    private Long id;

    private String name;

    private String address;

    private String phoneNumber;

}
