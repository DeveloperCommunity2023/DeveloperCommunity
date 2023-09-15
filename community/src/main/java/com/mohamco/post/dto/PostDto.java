package com.mohamco.post.dto;

import java.time.LocalDateTime;
import java.util.List;
import com.mohamco.board.entity.PostEntity;
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
    private String tag;
    private Integer likeCount;
    private Integer commentCount;
    private List<commentList> commentList;
  }

  @Builder
  @Getter
  public static class commentList {
    private String userProfileUrl;
    private String userSeq;
    private String userName;
    private LocalDateTime commentCreatedTs;
    private String commentContent;

    public static PostDto.commentList of(PostEntity postEntity) {
      return commentList.builder()
          .userSeq(postEntity.getUserSeq())
          .build();
      }
  }
}
