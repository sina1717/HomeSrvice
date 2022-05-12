package com.maktab.homeService.service;

import com.maktab.homeService.entity.Comment;
import com.maktab.homeService.entity.Proficient;
import com.maktab.homeService.repository.CommentRepo;
import com.maktab.homeService.service.interfaces.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepo repo;

    public CommentServiceImpl(CommentRepo repo) {
        this.repo = repo;
    }


    @Override
    public List<Comment> findByProficient(Proficient proficient) {
        return null;
    }

    @Override
    public void save(Comment comment) {
            repo.save(comment);
    }

    @Override
    public void update(Comment comment) {
            repo.save(comment);
    }

    @Override
    public void delete(Integer id) {
            repo.deleteById(id);
    }

    @Override
    public Optional<Comment> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Comment> findAll() {
        return repo.findAll();
    }
}
