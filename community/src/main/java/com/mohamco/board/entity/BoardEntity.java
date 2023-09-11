package com.mohamco.board.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "post")
public class BoardEntity {

  @Column(name = "post_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private String postSeq; // 게시글 아이디

  @Column(name = "board_seq")
  private String boardSeq; // 게시판 아이디

  @Column(name = "title")
  private String title; // 제목

  @Column(name = "content")
  private String content; // 내용

  @Column(name = "notice_yn")
  private Integer noticeYn; // 공지 여부

  @Column(name = "user_seq")
  private String userSeq; // 작성자 아이디

  @Column(name = "user_name")
  private String userName; // 작성자 이름

  @Column(name = "created_dt", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime createdDt; // 생성 일시

  @Column(name = "modified_dt", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime modifiedDt; // 수정 일시

  @Column(name = "view_count")
  private Integer viewCount; // 조회 수

  @Column(name = "like_count")
  private Integer likeCount; // 좋아요 수

  @Column(name = "comment_count")
  private Integer commentCount; // 댓글 수
}
