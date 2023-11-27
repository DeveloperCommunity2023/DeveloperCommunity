package com.mohamco.study.service;

import com.mohamco.study.dto.StudyDto;
import com.mohamco.study.dto.StudyRegDto;
import com.mohamco.study.entity.StudyEntity;
import com.mohamco.study.repository.StudyRepository;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudyService {
  private final StudyRepository studyRepository;

  public StudyDto.Response getStudyList() {
    List<StudyEntity> s = studyRepository.findAllByOpenYn(1);

    return StudyDto.Response.builder()
            .studyList(s.stream().map(StudyDto.StudyList::of).collect(Collectors.toList()))
            .build();
  }

  @Transactional
  public Object saveStudy(StudyRegDto studyReg) {
    return studyRepository.save(studyReg.toEntity());
  }
}