package com.mohamco.post.controller;

import com.mohamco.common.response.BaseResponse;
import com.mohamco.post.dto.PostRegDto;
import com.mohamco.post.service.PostRegService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<?> postSave(@RequestBody PostRegDto regDto) {
    return  ResponseEntity.ok(BaseResponse.builder()
        .data(postRegService.save(regDto)));
  }
}
