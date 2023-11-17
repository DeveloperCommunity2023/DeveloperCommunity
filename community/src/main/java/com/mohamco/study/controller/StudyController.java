package com.mohamco.study.controller;

import com.mohamco.common.response.BaseResponse;
import com.mohamco.study.dto.StudyRegDto;
import com.mohamco.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudyController {
  private final StudyService studyService;

  /**
   *
   * @return 스터디 리스트를 반환한다
   */
  @GetMapping("/v1/study/main")
  public ResponseEntity<?> getStudy() {
    return ResponseEntity.ok(BaseResponse.builder()
      .data(studyService.getStudyList()).build());
  }

  /**
   *
   * @param studyReg 스터디 등록 dto
   * @return 스터디를 등록한다
   */
  @PostMapping("/v1/study/create")
  public ResponseEntity<?> createStudy(@RequestBody StudyRegDto studyReg) {
    return ResponseEntity.ok(BaseResponse.builder()
            .data(studyService.saveStudy(studyReg)));
  }
}
