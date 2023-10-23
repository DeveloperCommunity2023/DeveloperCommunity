package com.mohamco.study.controller;

import com.mohamco.common.response.BaseResponse;
import com.mohamco.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudyController {
  private final StudyService studyService;
  /**
   *
   * @param
   * @return 게시글 리스트를 반환한다
   */
  @GetMapping("/v1/study/main")
  public ResponseEntity<?> getBoard() {
    return ResponseEntity.ok(BaseResponse.builder()
        .data(studyService.getStudyList()).build());
  }

}
