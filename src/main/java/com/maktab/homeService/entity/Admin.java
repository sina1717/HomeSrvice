package com.maktab.homeService.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@NoArgsConstructor
public class Admin extends Person{

    private Integer adminCode;

    public Admin(Integer id, String email, String firstname, String lastname, String password, Integer credit, Integer adminCode) {
        super(id, email, firstname, lastname, password, credit);
        this.adminCode = adminCode;
    }
}