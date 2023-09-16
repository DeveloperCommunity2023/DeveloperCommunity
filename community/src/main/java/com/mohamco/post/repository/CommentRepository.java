package com.mohamco.post.repository;

import java.util.List;
import com.mohamco.post.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

  List<CommentEntity> findAllByPostSeq(String postSeq);
}