package com.mohamco.board.dto;

import com.mohamco.board.entity.BoardEntity;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardDto {

  @Builder
  @Getter
  public static class PostList { // 게시글 리스트
    private String postSeq; // 게시글 아이디
    private String title; // 제목
    private String userSeq; // 작성자 아이디
    private String userName; // 작성자 이름
    private LocalDateTime createdDt; // 작성 일시
    private Integer viewCount; // 조회수
    private Integer likeCount; // 좋아요 수

    public static PostList of(BoardEntity boardEntity) {
      return PostList.builder()
              .postSeq(boardEntity.getPostSeq())
              .title(boardEntity.getTitle())
              .userSeq(boardEntity.getUserSeq())
              .userName(boardEntity.getUserName())
              .createdDt(boardEntity.getCreatedDt())
              .viewCount(boardEntity.getViewCount())
              .likeCount(boardEntity.getLikeCount())
              .build();
    }
  }
}
