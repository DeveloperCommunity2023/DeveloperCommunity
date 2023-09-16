package com.mohamco.post.service;

import com.mohamco.board.repository.PostRepository;
import com.mohamco.post.dto.PostDto;
import com.mohamco.post.entity.CommentEntity;
import com.mohamco.post.entity.PostEntity;
import com.mohamco.post.repository.CommentRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;
  private final CommentRepository commentRepository;

  public PostDto.Response getPost(String boardSeq, String postSeq) {
    PostEntity p = postRepository.findByPostSeq(postSeq);
    List<CommentEntity> c = commentRepository.findAllByPostSeq(postSeq);

    return PostDto.Response.builder()
        .boardSeq(boardSeq)
        .title(p.getTitle())
        .postSeq(postSeq)
        .userSeq(p.getUserSeq())
        .userName(p.getUserName())
        .postCreatedTs(p.getCreatedTs())
        .content(p.getContent())
        .likeCount(p.getLikeCount())
        .commentCount(p.getCommentCount())
        .commentList(c.stream().map(PostDto.CommentList::of).collect(Collectors.toList()))
        .build();

  }
}
