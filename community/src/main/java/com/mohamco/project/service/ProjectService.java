package com.mohamco.project.service;

import com.mohamco.project.dto.ProjectDto;
import com.mohamco.project.entity.ProjectEntity;
import com.mohamco.project.repository.ProjectRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {
  private final ProjectRepository projectRepository;

  public ProjectDto.Response getProjectList() {
    List<ProjectEntity> p = projectRepository.findAllByOpenYn(1);

    return ProjectDto.Response.builder()
            .projectList(p.stream().map(ProjectDto.ProjectList::of).collect(Collectors.toList()))
            .build();
  }

}
