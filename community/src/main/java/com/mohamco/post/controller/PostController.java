package com.mohamco.post.controller;

import com.mohamco.post.service.PostService;
import com.mohamco.common.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
  private final PostService postService;

  /**
   *
   * @param postSeq (게시글 아이디)
   * @return 게시글 상세를 반환한다
   */
  @GetMapping("/v1/{boardSeq}/{postSeq}")
  public ResponseEntity<?> getPost(@PathVariable("boardSeq") String boardSeq,
                                   @PathVariable("postSeq") String postSeq) {
      return ResponseEntity.ok(BaseResponse.builder()
              .data(postService.getPost(boardSeq, postSeq)).build());
  }
}
