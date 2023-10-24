package com.mohamco.board.repository;

import com.mohamco.post.entity.PostEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

  List<PostEntity> findAllByBoardSeq(String boardSeq);

  PostEntity findByPostSeq(Long postSeq);
}
