package com.mohamco.study.dto;

import com.mohamco.board.dto.BoardDto;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class StudyDto {
  @Builder
  @Getter
  public static class Response {
    private Long studySeq;
  }

}
