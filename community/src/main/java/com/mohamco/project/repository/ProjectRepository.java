package com.mohamco.project.repository;

import com.mohamco.project.entity.ProjectEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
  List<ProjectEntity> findAllByOpenYn(Integer openYn);

}
