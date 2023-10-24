package com.mohamco.post.repository;

import com.mohamco.post.entity.CommentEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

  List<CommentEntity> findAllByPostSeq(Long postSeq);
}