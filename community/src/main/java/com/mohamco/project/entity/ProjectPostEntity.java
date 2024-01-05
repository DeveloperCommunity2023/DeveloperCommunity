package com.mohamco.project.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "project_post")
public class ProjectPostEntity {

  @Column(name = "project_post_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long projectPostSeq; // 게시글 아이디

  @Column(name = "project_seq")
  private Long projectSeq; // 게시판 아이디


  @Column(name = "board_seq")
  private String boardSeq; // 게시판 아이디

  @Column(name = "board_name")
  private String boardName; // 게시판 아이디

  @Column(name = "title")
  private String title; // 제목

  @Column(name = "content")
  private String content; // 내용

  @Column(name = "notice_yn")
  private Boolean noticeYn; // 공지 여부

  @Column(name = "user_seq")
  private Long userSeq; // 작성자 아이디

  @Column(name = "user_name")
  private String userName; // 작성자 이름

  @Column(name = "created_ts", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime createdTs; // 생성 일시

  @Column(name = "modified_ts", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime modifiedTs; // 수정 일시

  @Column(name = "view_count")
  private Integer viewCount; // 조회 수

  @Column(name = "like_count")
  private Integer likeCount; // 좋아요 수

  @Column(name = "comment_count")
  private Integer commentCount; // 댓글 수

  @Builder
  public ProjectPostEntity(Long projectPostSeq, Long projectSeq, String boardSeq,
                           String boardName, String title, String content,
                           Boolean noticeYn, Long userSeq,  String userName,
                           Integer viewCount, Integer likeCount, Integer commentCount) {
    this.projectPostSeq = projectPostSeq;
    this.projectSeq = projectSeq;
    this.boardSeq = boardSeq;
    this.boardName = boardName;
    this.title = title;
    this.content = content;
    this.noticeYn = noticeYn;
    this.userSeq = userSeq;
    this.userName = userName;
    this.viewCount = viewCount;
    this.likeCount = likeCount;
    this.commentCount = commentCount;
  }
}
