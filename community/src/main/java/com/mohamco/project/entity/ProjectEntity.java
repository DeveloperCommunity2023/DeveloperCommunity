package com.mohamco.project.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "project")
public class ProjectEntity {
  @Column(name = "project_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long projectSeq; // 프로젝트 아이디

  @Column(name = "project_name")
  private String projectName; // 프로젝트 이름

  @Column(name = "recruit_yn")
  private Integer recruitYn; // 프로젝트 모집여부

  @Column(name = "recruit_type")
  private Integer recruitType; // 프로젝트 종류

  @Column(name = "open_yn")
  private Integer openYn; // 공개여부

  @Column(name = "project_count")
  private Integer projectCount; // 프로젝트 인원 수

  @Column(name = "closing_dt")
  private LocalDateTime closingDt; // 모집 마감일

  @Column(name = "manager_seq")
  private Long managerSeq; // 프로젝트장 아이디

  @Column(name = "register_type")
  private Integer registerType; // 가입 종류

  @Column(name = "created_dt")
  private LocalDateTime createdDt; // 프로젝트 생성일

  @Column(name = "header_url")
  private String headerUrl; // 프로젝트 헤더 url

  @Column(name = "profile_url")
  private String profileUrl; // 프로젝트 프로필 이미지 url

  @Column(name = "project_desc")
  private String projectDesc; // 프로젝트 설명

  @Builder
  public ProjectEntity(Long projectSeq, String projectName,
                       String projectDesc, Integer openYn,
                       Integer registerType, Integer projectCount) {
    this.projectSeq = projectSeq;
    this.projectName = projectName;
    this.projectDesc = projectDesc;
    this.openYn = openYn;
    this.registerType = registerType;
    this.projectCount = projectCount;
  }
}
