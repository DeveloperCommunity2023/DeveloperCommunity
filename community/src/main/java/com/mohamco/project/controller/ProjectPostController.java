package com.mohamco.project.controller;

import com.mohamco.common.response.BaseResponse;
import com.mohamco.project.service.ProjectPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ProjectPostController {
  private final ProjectPostService projectPostService;

  /**
   *
   * @param projectSeq, boardSeq (게시판 아이디)
   * @return 게시글 리스트를 반환한다
   */
  @GetMapping("/v1/project/board")
  public ResponseEntity<?> getBoard(Long projectSeq, String boardSeq){
    return ResponseEntity.ok(BaseResponse.builder()
            .data(projectPostService.getPostList(projectSeq, boardSeq)).build());
  }


}
