package com.mohamco.project.controller;

import com.mohamco.common.response.BaseResponse;
import com.mohamco.project.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProjectController {
  private final ProjectService projectService;

  /**
   *
   * @return 프로젝트 리스트를 반환한다.
   */
  @GetMapping("/v1/project/main")
  public ResponseEntity<?> getProjectList() {
    return ResponseEntity.ok(BaseResponse.builder()
            .data(projectService.getProjectList()).build());
  }

  /**
   * @param projectSeq (게시글 아이디)
   * @return 프로젝트 상세를 반환한다.
   */
  @GetMapping("/v1/project/{projectSeq}")
  public ResponseEntity<?> getProject(@PathVariable("projectSeq") Long projectSeq) {
    return ResponseEntity.ok(BaseResponse.builder()
            .data(projectService.getProject(projectSeq)).build());
  }

}
