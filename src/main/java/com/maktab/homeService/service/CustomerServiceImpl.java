package com.maktab.homeService.service;

import com.maktab.homeService.entity.Customer;
import com.maktab.homeService.repository.CustomerRepo;
import com.maktab.homeService.service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends PersonServiceImpl<Customer>  implements CustomerService {
    private CustomerRepo repo;

    public CustomerServiceImpl(CustomerRepo repo) {
        super(repo);
        this.repo = repo;
    }
}
