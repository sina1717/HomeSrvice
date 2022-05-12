package com.maktab.homeService.service;

import com.maktab.homeService.entity.Order;
import com.maktab.homeService.repository.OrderRepo;
import com.maktab.homeService.service.interfaces.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl  implements OrderService {

    private OrderRepo repo;

    public OrderServiceImpl(OrderRepo repo) {
        this.repo = repo;
    }


    @Override
    public void save(Order order) {
        repo.save(order);
    }

    @Override
    public void update(Order order) {
        repo.save(order);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Order> findAll() {
        return repo.findAll();
    }
}
