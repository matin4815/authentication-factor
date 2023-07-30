package com.me.authenticationbackend.dto;

import com.me.authenticationbackend.dal.entity.Factor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellerDto {

    private Long id;

    private String salesUnit;

    private String companyName;

    private String description;

    private String phoneNumber;

}
