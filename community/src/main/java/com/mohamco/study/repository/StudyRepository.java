package com.mohamco.study.repository;

import com.mohamco.study.entity.StudyEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<StudyEntity, Long> {
  List<StudyEntity> findAllByOpenYn(Integer openYn);

}