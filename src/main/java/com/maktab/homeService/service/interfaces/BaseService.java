package com.maktab.homeService.service.interfaces;

import java.util.List;
import java.util.Optional;

public interface BaseService<E> {

    public void save(E e);

    public void update(E e);

    public void delete(Integer id);

    public Optional<E> findById(Integer id);

    public List<E> findAll();
}
