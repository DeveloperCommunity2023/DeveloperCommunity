package com.mohamco.board.dto;

import com.mohamco.post.entity.PostEntity;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardDto {

  @Builder
  @Getter
  public static class Response {
    private String boardSeq;
    private String boardName;
    private String boardDesc;
    private List<PostList> postList;
  }

  @Builder
  @Getter
  public static class PostList { // 게시글 리스트
    private Long postSeq; // 게시글 아이디
    private String title; // 제목
    private Long userSeq; // 작성자 아이디
    private String userName; // 작성자 이름
    private LocalDateTime createdDt; // 작성 일시
    private Integer viewCount; // 조회수
    private Integer likeCount; // 좋아요 수

    public static PostList of(PostEntity postEntity) {
      return PostList.builder()
              .postSeq(postEntity.getPostSeq())
              .title(postEntity.getTitle())
              .userSeq(postEntity.getUserSeq())
              .userName(postEntity.getUserName())
              .createdDt(postEntity.getCreatedTs())
              .viewCount(postEntity.getViewCount())
              .likeCount(postEntity.getLikeCount())
              .build();
    }
  }
}
