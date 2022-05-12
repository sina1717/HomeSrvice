package com.maktab.homeService.repository;

import com.maktab.homeService.entity.Comment;
import com.maktab.homeService.entity.Proficient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CommentRepo extends JpaRepository<Comment,Integer> {

    List<Comment> findByProficient(Proficient proficient);
}
