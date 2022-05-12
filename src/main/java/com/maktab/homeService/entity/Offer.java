package com.maktab.homeService.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity

public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Order order;

    private String description;

    @ManyToOne
    private Customer customer;

    private Date date;

    private Integer offeredSalary;

    private Double timeOfWork;

}
