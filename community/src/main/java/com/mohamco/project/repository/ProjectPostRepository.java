package com.mohamco.project.repository;

import com.mohamco.project.entity.ProjectPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectPostRepository extends JpaRepository<ProjectPostEntity, Long>  {
  List<ProjectPostEntity> findAllByProjectSeqAndBoardSeq(Long projectSeq, String boardSeq);

}
