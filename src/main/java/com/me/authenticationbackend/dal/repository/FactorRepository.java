package com.me.authenticationbackend.dal.repository;

import com.me.authenticationbackend.dal.entity.Factor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FactorRepository extends JpaRepository<Factor, Long> {

    Optional<Factor> findByFactorNumber(Long factorNumber);
}
