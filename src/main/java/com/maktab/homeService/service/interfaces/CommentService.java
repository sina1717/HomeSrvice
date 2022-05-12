package com.maktab.homeService.service.interfaces;

import com.maktab.homeService.entity.Comment;
import com.maktab.homeService.entity.Proficient;

import java.util.List;

public interface CommentService extends BaseService<Comment>{

    List<Comment> findByProficient(Proficient proficient);
}
