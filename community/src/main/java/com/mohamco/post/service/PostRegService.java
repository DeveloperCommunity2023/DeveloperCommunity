package com.mohamco.post.service;

import com.mohamco.post.dto.PostRegDto;
import com.mohamco.post.repository.PostRegRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PostRegService {

  private final PostRegRepository postRegRepository;

  @Transactional
  public String save(PostRegDto regDto) {
    return postRegRepository.save(regDto.toEntity()).getUserName();
  }
}
