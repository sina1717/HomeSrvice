package com.maktab.homeService.service;


import com.maktab.homeService.entity.Offer;
import com.maktab.homeService.repository.OfferRepo;
import com.maktab.homeService.service.interfaces.OfferService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {

    private OfferRepo repo;

    public OfferServiceImpl(OfferRepo repo) {
        this.repo = repo;
    }

    @Override
    public void save(Offer offer) {
        repo.save(offer);
    }

    @Override
    public void update(Offer offer) {
        repo.save(offer);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Offer> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Offer> findAll() {
        return repo.findAll();
    }
}
