package com.me.authenticationbackend.dal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sellers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String salesUnit;

    @Column(nullable = false)
    private String companyName;

    private String description;

    private String phoneNumber;

    @OneToOne(mappedBy = "seller")
    private Factor factor;

}
