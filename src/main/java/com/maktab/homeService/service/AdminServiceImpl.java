package com.maktab.homeService.service;

import com.maktab.homeService.entity.Admin;
import com.maktab.homeService.repository.AdminRepo;
import com.maktab.homeService.service.interfaces.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends PersonServiceImpl<Admin> implements AdminService {

    private AdminRepo repo;


    public AdminServiceImpl(AdminRepo repo) {
        super(repo);
        this.repo = repo;

    }
}
