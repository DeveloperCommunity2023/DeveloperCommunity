package com.mohamco.post.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user")
public class UserEntity {
  @Column(name = "user_seq")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long userSeq; // 회원 아이디

  @Column(name = "name")
  private String name; // 회원 이름

  @Column(name = "nickname")
  private String nickname; // 회원 닉네임

  @Column(name = "profile_image_url")
  private String profileImageUrl; // 회원 프로필 이미지 URL
}
