package com.mohamco.post.service;

import com.mohamco.board.entity.PostEntity;
import com.mohamco.board.repository.PostRepository;
import com.mohamco.post.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;

  public PostDto.Response getPost(String boardSeq, String postSeq) {
    PostEntity p = postRepository.findByPostSeq(postSeq);

    return PostDto.Response.builder()
        .boardSeq(boardSeq)
        .title(p.getTitle())
        .postSeq(postSeq)
        .userSeq(p.getUserSeq())
        .userName(p.getUserName())
        .postCreatedTs(p.getCreatedTs())
        .content(p.getContent())
        .tag(p.getTag())
        .likeCount(p.getLikeCount())
        .commentCount(p.getCommentCount())
        .build();

  }
}
