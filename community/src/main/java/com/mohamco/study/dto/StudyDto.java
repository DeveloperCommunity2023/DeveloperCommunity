package com.mohamco.study.dto;

import com.mohamco.study.entity.StudyEntity;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
public class StudyDto {
  @Builder
  @Getter
  public static class Response {
    List<StudyDto.StudyList> studyList;
  }

  @Builder
  @Getter
  public static class StudyList { // 스터디 리스트
    private Long studySeq; // 스터디 아이디
    private String studyName; // 스터디 이름
    private String studyDesc; // 스터디 설명
    private Integer studyCount; // 스터디 인원 수
    private String profileUrl; // 스터디 프로필 이미지
    private String headerUrl; // 스터디 헤더 이미지
    private Integer recruitYn; // 스터디 모집 여부


    public static StudyList of(StudyEntity studyEntity) {
      return StudyList.builder()
          .studySeq(studyEntity.getStudySeq())
          .studyName(studyEntity.getStudyName())
          .studyDesc(studyEntity.getStudyDesc())
          .studyCount(studyEntity.getStudyCount())
          .profileUrl(studyEntity.getProfileUrl())
          .headerUrl(studyEntity.getHeaderUrl())
          .recruitYn(studyEntity.getRecruitYn())
          .build();
    }
  }
}
