package com.maktab.homeService.service;

import com.maktab.homeService.entity.Specialty;
import com.maktab.homeService.repository.SpecialtyRepo;
import com.maktab.homeService.service.interfaces.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {

    private SpecialtyRepo repo;

    public SpecialtyServiceImpl(SpecialtyRepo repo) {
        this.repo = repo;
    }

    @Override
    public void save(Specialty specialty) {
        repo.save(specialty);
    }

    @Override
    public void update(Specialty specialty) {
        repo.save(specialty);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Specialty> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Specialty> findAll() {
        return repo.findAll();
    }
}
