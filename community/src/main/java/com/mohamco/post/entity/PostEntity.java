package com.mohamco.post.entity;

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
public class PostEntity {

  @Column(name = "post_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long postSeq; // 게시글 아이디

  @Column(name = "board_seq")
  private String boardSeq; // 게시판 아이디

  @Column(name = "title")
  private String title; // 제목

  @Column(name = "content")
  private String content; // 내용

  @Column(name = "notice_yn")
  private Integer noticeYn; // 공지 여부

  @Column(name = "user_seq")
  private Long userSeq; // 작성자 아이디

  @Column(name = "user_name")
  private String userName; // 작성자 이름

  @Column(name = "solve_yn")
  private String solveYn; // 해결여부(미해결: 0 / 해결: 1)

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
}
