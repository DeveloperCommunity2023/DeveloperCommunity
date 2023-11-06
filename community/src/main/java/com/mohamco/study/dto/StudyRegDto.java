package com.mohamco.study.dto;

import com.mohamco.study.entity.StudyEntity;
import lombok.Getter;

@Getter
public class StudyRegDto { // 스터디 등록
  private Long studySeq; // 스터디 아이디
  private String studyName; // 스터디 이름
  private String studyDesc; // 스터디 설명
  private Integer openYn; // 스터디 공개여부
  private Integer registerType; // 스터디 가입종류
  private Integer studyCount; // 스터디 인원 수


  public StudyEntity toEntity() {
    return StudyEntity.builder()
        .studySeq(studySeq)
        .studyName(studyName)
        .studyDesc(studyDesc)
        .openYn(openYn)
        .registerType(registerType)
        .build();
  }
}