package com.mohamco.study.entity;


import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "study")
public class StudyEntity {
  @Column(name = "study_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private String studySeq; // 스터디 아이디

  @Column(name = "study_name")
  private String studyName; // 스터디 이름

  @Column(name = "recruit_yn")
  private String recruitYn; // 스터디 종류

  @Column(name = "recruit_type")
  private String recruitType; // 스터디 설명

  @Column(name = "open_yn")
  private String openYn; // 공개여부

  @Column(name = "study_count")
  private String studyCount; // 스터디 인원 수

  @Column(name = "closing_dt")
  private String closingDt; // 모집 마감일

  @Column(name = "manager_seq")
  private String managerSeq; // 스터디장 아이디

  @Column(name = "register_type")
  private String registerType; // 가입 종류

  @Column(name = "created_dt")
  private String createdDt; // 스터디 생성일

  @Column(name = "header_url")
  private String headerUrl; // 스터디 헤더 url

  @Column(name = "profile_url")
  private String profileUrl; // 스터디 프로필 이미지 url
}
