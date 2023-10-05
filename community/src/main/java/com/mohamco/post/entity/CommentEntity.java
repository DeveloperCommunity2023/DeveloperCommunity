package com.mohamco.post.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "comment")
public class CommentEntity {
  @Column(name = "comment_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private String commentSeq; // 댓글 아이디

  @Column(name = "board_seq")
  private String boardSeq; // 게시판 아이디

  @Column(name = "post_seq")
  private String postSeq; // 게시글 아이디

  @Column(name = "content")
  private String content; // 댓글 내용

  @Column(name = "user_seq")
  private String userSeq; // 작성자 아이디

  @Column(name = "user_name")
  private String userName; // 작성자 이름

  @Column(name = "reply_seq")
  private String replySeq; // 대댓글 작성자 아이디

  @Column(name = "reply_name")
  private String replyName; // 대댓글 작성자 이름

  @Column(name = "created_ts")
  private LocalDateTime createdTs; // 댓글 작성 일시

  @Column(name = "modified_ts")
  private LocalDateTime modifiedTs; // 댓글 수정 일시

  @Column(name = "comment_group_seq")
  private String commentGroupSeq; // 댓글 그룹 아이디

  @Column(name = "comment_depth")
  private Integer commentDepth; // 댓글 깊이

  @ManyToOne
  @JoinColumn(name = "user_seq", referencedColumnName = "user_seq",
      insertable = false, updatable = false) // 누가 답변을 적었는지 알기 위함
  private UserEntity user;
}