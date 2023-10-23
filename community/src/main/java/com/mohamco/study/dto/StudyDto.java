package com.mohamco.study.dto;

import com.mohamco.board.dto.BoardDto;
import com.mohamco.post.entity.PostEntity;
import com.mohamco.study.entity.StudyEntity;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class StudyDto {
  @Builder
  @Getter
  public static class Response {
    private Long studySeq;
    List<StudyDto.StudyList> studyList;
  }

  @Builder
  @Getter
  public static class StudyList { // 게시글 리스트
    private Long studySeq; //
    private String studyName; //
    private String studyDesc; //
    private Integer studyCount; //
    private String profileUrl;
    private String headerUrl; //


    public static StudyList of(StudyEntity studyEntity) {
      return StudyList.builder()
          .studySeq(studyEntity.getStudySeq())
          .studyName(studyEntity.getStudyName())
          .studyDesc(studyEntity.getStudyDesc())
          .studyCount(studyEntity.getStudyCount())
          .profileUrl(studyEntity.getProfileUrl())
          .headerUrl(studyEntity.getHeaderUrl())
          .build();
    }
  }


}
