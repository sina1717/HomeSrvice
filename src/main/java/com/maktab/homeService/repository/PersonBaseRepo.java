package com.maktab.homeService.repository;

import com.maktab.homeService.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonBaseRepo<T extends Person> extends CrudRepository<Person, Integer> {

//    Person findByEm(String email);

}
