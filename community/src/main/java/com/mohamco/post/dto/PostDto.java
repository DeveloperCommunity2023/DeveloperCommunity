package com.mohamco.post.dto;

import com.mohamco.board.entity.PostEntity;
import java.time.LocalDateTime;
import java.util.List;

import com.mohamco.post.entity.CommentEntity;
import com.mohamco.post.entity.UserEntity;
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
//          .userName(userEntity.getName())
//          .userProfileUrl(userEntity.getProfileImageUrl())
          .commentCreatedTs(commentEntity.getCreatedTs())
          .commentContent(commentEntity.getContent())
          .build();
    }
  }
}
