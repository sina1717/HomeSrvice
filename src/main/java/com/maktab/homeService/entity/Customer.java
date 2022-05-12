package com.maktab.homeService.entity;


import com.maktab.homeService.entity.enums.CustomerStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@Entity

public class Customer extends Person{

    private CustomerStatus status;



    public Customer(Integer id, String email, String firstname, String lastname, String password, CustomerStatus customerStatus, Integer credit) {
        super(id, email, firstname, lastname, password,credit);
        this.status = customerStatus;
    }
}
