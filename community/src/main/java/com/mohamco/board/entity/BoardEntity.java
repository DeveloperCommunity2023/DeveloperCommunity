package com.mohamco.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "board")
public class BoardEntity {

  @Column
  @Id
  private String boardSeq;
}
