package com.me.authenticationbackend.dal.repository;

import com.me.authenticationbackend.dal.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityRepository extends JpaRepository<Commodity, Long> {

    List<Commodity> findAllByFactorId(Long factorId);

}
