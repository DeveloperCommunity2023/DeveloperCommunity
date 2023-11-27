package com.mohamco.project.dto;

import com.mohamco.project.entity.ProjectEntity;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ProjectDto {
  @Builder
  @Getter
  public static class CommonResponse {
    private Long projectSeq; // 프로젝트 아이디
    private String projectName; // 프로젝트 이름
    private String projectDesc; // 프로젝트 설명
    private Integer projectCount; // 프로젝트 인원 수
    private String profileUrl; // 프로젝트 프로필 이미지
    private String headerUrl; // 프로젝트 헤더 이미지
    private Integer recruitYn; // 프로젝트 모집 여부
  }

  @Builder
  @Getter
  public static class Response {
    List<Project> projectList;
  }

  @Builder
  @Getter
  public static class Project { // 프로젝트 Dto
    private Long projectSeq; // 프로젝트 아이디
    private String projectName; // 프로젝트 이름
    private String projectDesc; // 프로젝트 설명
    private Integer projectCount; // 프로젝트 인원 수
    private String profileUrl; // 프로젝트 프로필 이미지
    private String headerUrl; // 프로젝트 헤더 이미지
    private Integer recruitYn; // 프로젝트 모집 여부


    public static Project of(ProjectEntity projectEntity) {
      return Project.builder()
              .projectSeq(projectEntity.getProjectSeq())
              .projectName(projectEntity.getProjectName())
              .projectDesc(projectEntity.getProjectDesc())
              .projectCount(projectEntity.getProjectCount())
              .profileUrl(projectEntity.getProfileUrl())
              .headerUrl(projectEntity.getHeaderUrl())
              .recruitYn(projectEntity.getRecruitYn())
              .build();
    }
  }
}
