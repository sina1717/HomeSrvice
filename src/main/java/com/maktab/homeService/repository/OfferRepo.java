package com.maktab.homeService.repository;

import com.maktab.homeService.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepo extends JpaRepository<Offer,Integer> {
}
