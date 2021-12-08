package com.car.controller.implementation;

import com.car.domain.Comment;
import com.car.dto.CommentDto;
import com.car.mapper.AbstractMapper;
import com.car.mapper.CommentMapper;
import com.car.service.AbstractService;
import com.car.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.controller.AbstractController;


@RequestMapping(value = "/comment")
@RestController
@AllArgsConstructor
public class CommentController extends AbstractController<Comment, CommentDto, Integer> {
    private final CommentService commentService;
    private final CommentMapper commentMapper;

    @Override
    protected AbstractService< Comment, Integer> getService() {
        return commentService;
    }

    @Override
    protected AbstractMapper< Comment,  CommentDto> getMapper() {
        return commentMapper;
    }
}
