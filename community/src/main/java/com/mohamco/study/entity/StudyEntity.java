package com.mohamco.study.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "study")
public class StudyEntity {
  @Column(name = "study_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long studySeq; // 스터디 아이디

  @Column(name = "study_name")
  private String studyName; // 스터디 이름

  @Column(name = "recruit_yn")
  private Integer recruitYn; // 스터디 모집여부

  @Column(name = "recruit_type")
  private Integer recruitType; // 스터디 종류

  @Column(name = "open_yn")
  private Integer openYn; // 공개여부

  @Column(name = "study_count")
  private Integer studyCount; // 스터디 인원 수

  @Column(name = "closing_dt")
  private LocalDateTime closingDt; // 모집 마감일

  @Column(name = "manager_seq")
  private Long managerSeq; // 스터디장 아이디

  @Column(name = "register_type")
  private Integer registerType; // 가입 종류

  @Column(name = "created_dt")
  private LocalDateTime createdDt; // 스터디 생성일

  @Column(name = "header_url")
  private String headerUrl; // 스터디 헤더 url

  @Column(name = "profile_url")
  private String profileUrl; // 스터디 프로필 이미지 url

  @Column(name = "study_desc")
  private String studyDesc; // 스터디 설명


  @Builder
  public StudyEntity(Long studySeq, String studyName,
                     String studyDesc, Integer openYn,
                     Integer registerType, Integer studyCount) {
    this.studySeq = studySeq;
    this.studyName = studyName;
    this.studyDesc = studyDesc;
    this.openYn = openYn;
    this.registerType = registerType;
    this.studyCount = studyCount;
  }
}
