package com.me.authenticationbackend.dal.repository;

import com.me.authenticationbackend.dal.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
