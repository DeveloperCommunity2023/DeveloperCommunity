package com.mohamco.post.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.mohamco.post.entity.CommentEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostDto {

  @Builder
  @Getter
  public static class Response {
    private String boardSeq;
    private String boardName;
    private String postSeq;
    private String title;
    private String userSeq;
    private String userName;
    private LocalDateTime postCreatedTs;
    private String content;
    private Integer likeCount;
    private Integer commentCount;
    private List<CommentList> commentList;
  }

  @Builder
  @Getter
  public static class CommentList {
    private String userProfileUrl;
    private String userSeq;
    private String userName;
    private LocalDateTime commentCreatedTs;
    private String commentContent;

    public static CommentList of(CommentEntity commentEntity) {
      return CommentList.builder()
          .userSeq(commentEntity.getUserSeq())
          .userName(commentEntity.getUser().getName())
          .userProfileUrl(commentEntity.getUser().getProfileImageUrl())
          .commentCreatedTs(commentEntity.getCreatedTs())
          .commentContent(commentEntity.getContent())
          .build();
    }
  }
}
