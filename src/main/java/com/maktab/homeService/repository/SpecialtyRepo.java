package com.maktab.homeService.repository;

import com.maktab.homeService.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepo extends JpaRepository<Specialty,Integer> {
}
