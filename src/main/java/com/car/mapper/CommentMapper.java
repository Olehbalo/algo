package com.car.mapper;

import com.car.domain.Comment;
import com.car.dto.CommentDto;
import org.springframework.stereotype.Component;



@Component
public class CommentMapper extends AbstractMapper<Comment,CommentDto> {

    @Override
    public CommentDto mapObjectToDto(Comment comment) {
        if (comment == null)
            return null;

        CommentDto.CommentDtoBuilder commentDto = CommentDto.builder();
        commentDto.id(comment.getId());
        commentDto.nickname(comment.getNickname());
        commentDto.message(comment.getMessage());
        commentDto.customer(comment.getCustomer().getFirstName());

        return commentDto.build();
    }
}


