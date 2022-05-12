package com.maktab.homeService.entity;

import com.maktab.homeService.entity.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order1")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Proficient proficient;

    @ManyToOne
    private Specialty specialist;

    private Integer salary;

    private String description;

    private OrderStatus status;
}
