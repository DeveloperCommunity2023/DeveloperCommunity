package com.mohamco.project.dto;

import com.mohamco.board.dto.BoardDto;
import com.mohamco.post.dto.PostDto;
import com.mohamco.post.entity.CommentEntity;
import com.mohamco.project.entity.ProjectPostEntity;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ProjectPostDto {

  @Builder
  @Getter
  public static class Response {
    List<ProjectPost> projectPostList;
  }
  @Builder
  @Getter
  public static class ProjectPost {
    private Long projectPostSeq;
    private Long projectSeq;
    private String boardSeq;
    private String boardName;
    private String title;
    private String content;
    private Boolean noticeYn;
    private Long userSeq;
    private String userName;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
    private Long viewCount;
    private Integer likeCount;
    private Integer commentCount;

    public static ProjectPost of(ProjectPostEntity projectPostEntity){
      return ProjectPost.builder()
              .projectPostSeq(projectPostEntity.getProjectPostSeq())
              .projectSeq(projectPostEntity.getProjectSeq())
              .boardSeq(projectPostEntity.getBoardSeq())
              .boardName(projectPostEntity.getBoardName())
              .title(projectPostEntity.getTitle())
              .content(projectPostEntity.getContent())
              .noticeYn(projectPostEntity.getNoticeYn())
              .userSeq(projectPostEntity.getUserSeq())
              .userName(projectPostEntity.getUserName())
              .createdTs(projectPostEntity.getCreatedTs())
              .modifiedTs(projectPostEntity.getModifiedTs())
              .viewCount(projectPostEntity.getProjectPostSeq())
              .likeCount(projectPostEntity.getLikeCount())
              .commentCount(projectPostEntity.getCommentCount())
              .build();
    }
  }



  @Builder
  @Getter
  public static class CommentList {
    private String userProfileUrl;
    private Long userSeq;
    private String userName;
    private LocalDateTime commentCreatedTs;
    private String commentContent;

    public static PostDto.CommentList of(CommentEntity commentEntity) {
      return PostDto.CommentList.builder()
              .userSeq(commentEntity.getUserSeq())
              .userName(commentEntity.getUser().getName())
              .userProfileUrl(commentEntity.getUser().getProfileImageUrl())
              .commentCreatedTs(commentEntity.getCreatedTs())
              .commentContent(commentEntity.getContent())
              .build();
    }
  }
}
