package com.maktab.homeService.service;

import com.maktab.homeService.entity.Person;
import com.maktab.homeService.repository.PersonBaseRepo;
import com.maktab.homeService.service.interfaces.PersonService;

import java.util.List;
import java.util.Optional;

public class PersonServiceImpl <E extends Person>   implements PersonService<E> {

    private PersonBaseRepo repo;

    public PersonServiceImpl(PersonBaseRepo repo) {
        this.repo = repo;
    }


    public void save(E e){
        repo.save(e);
    }

    public void update(E e){
        repo.save(e);
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }

    public Optional<E> findById(Integer id){
        return repo.findById(id);
    }

    public List<E> findAll(){
        return (List<E>) repo.findAll();
    }

}
