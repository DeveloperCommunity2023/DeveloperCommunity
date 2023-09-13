package com.mohamco.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "board")
public class BoardEntity {

  @Column(name = "board_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private String boardSeq; // 게시판 아이디

  @Column(name = "board_name")
  private String boardName; // 게시판 이름

  @Column(name = "board_type")
  private String boardType; // 게시판 종류

  @Column(name = "board_desc")
  private String boardDesc; // 게시판 설명
}
