package com.mohamco.post.dto;

import com.mohamco.post.entity.PostEntity;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRegDto {
  private Long postSeq;
  private String boardSeq;
  private String title;
  private String content;
  private Integer notice_yn;
  private Long userSeq;
  private String userName;
  private LocalDateTime postCreatedTs;
  private Integer view_count;
  private Integer likeCount;
  private Integer commentCount;
  private Integer solve_yn;



  public PostEntity toEntity() {
    return PostEntity.builder()
      .postSeq(postSeq).boardSeq(boardSeq).title(title)
      .content(content).userSeq(userSeq).userName(userName)
      .likeCount(likeCount).commentCount(commentCount)
      .build();
  }
}
