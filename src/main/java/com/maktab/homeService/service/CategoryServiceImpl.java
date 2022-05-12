package com.maktab.homeService.service;

import com.maktab.homeService.entity.Category;
import com.maktab.homeService.repository.CategoryRepo;
import com.maktab.homeService.service.interfaces.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepo repo;

    public CategoryServiceImpl(CategoryRepo repo) {
        this.repo = repo;
    }


    @Override
    public void save(Category category) {
            repo.save(category);
    }

    @Override
    public void update(Category category) {
            repo.save(category);
    }

    @Override
    public void delete(Integer id) {
            repo.deleteById(id);
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return repo.findAll();
    }
}
