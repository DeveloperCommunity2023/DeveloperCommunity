package com.mohamco.post.controller;

import com.mohamco.post.dto.PostRegDto;
import com.mohamco.post.service.PostRegService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class PostRegController {

  private final PostRegService postRegService;

  /**
    *
    * @param regDto (PostRegDto)
    * @return 게시글을 등록한다
  */

  @PostMapping("/v1/board/posts")
  public String postSave(@RequestBody PostRegDto regDto) {
    return postRegService.save(regDto);
  }
}
