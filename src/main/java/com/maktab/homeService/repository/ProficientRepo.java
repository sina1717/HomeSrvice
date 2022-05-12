package com.maktab.homeService.repository;

import com.maktab.homeService.entity.Customer;
import com.maktab.homeService.entity.Proficient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProficientRepo extends PersonBaseRepo<Proficient>  {

    Proficient findByEmail(String email);


}
