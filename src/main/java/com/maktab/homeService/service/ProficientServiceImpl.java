package com.maktab.homeService.service;

import com.maktab.homeService.entity.Proficient;
import com.maktab.homeService.repository.ProficientRepo;
import com.maktab.homeService.service.interfaces.ProficientService;
import org.springframework.stereotype.Service;

@Service
public class ProficientServiceImpl extends PersonServiceImpl<Proficient>  implements ProficientService {

    private ProficientRepo repo;

    public ProficientServiceImpl(ProficientRepo repo) {
        super(repo);
        this.repo = repo;
    }
}
