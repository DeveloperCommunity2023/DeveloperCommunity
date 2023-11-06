package com.mohamco.post.service;

import com.mohamco.board.repository.PostRepository;
import com.mohamco.post.dto.PostRegDto;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PostRegService {

  private final PostRepository postRepository;

  @Transactional
  public String save(PostRegDto regDto) {
    return postRepository.save(regDto.toEntity()).getUserName();
  }
}