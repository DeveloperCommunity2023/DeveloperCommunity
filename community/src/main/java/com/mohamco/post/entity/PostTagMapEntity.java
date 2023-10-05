package com.mohamco.post.entity;

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
@Table(name = "post_tag_map")
public class PostTagMapEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "post_tag_map_seq")
  private Long postTagMapSeq;

  @ManyToOne
  @JoinColumn(name = "post_seq")
  private PostEntity postSeq;

  @ManyToOne
  @JoinColumn(name = "tag_seq")
  private TagEntity tagSeq;
}
