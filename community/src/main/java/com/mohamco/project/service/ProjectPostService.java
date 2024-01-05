package com.mohamco.project.service;


import com.mohamco.board.dto.BoardDto;
import com.mohamco.project.dto.ProjectPostDto;
import com.mohamco.project.entity.ProjectPostEntity;
import com.mohamco.project.repository.ProjectPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectPostService {
  private final ProjectPostRepository ProjectPostRepository;

  /**
   * 게시글 리스트 반환
   */
  public ProjectPostDto.Response getPostList(Long projectSeq, String boardSeq){
    List<ProjectPostEntity> p = ProjectPostRepository.findAllByProjectSeqAndBoardSeq(projectSeq, boardSeq);

    return ProjectPostDto.Response.builder()
            .projectPostList(p.stream()
                    .map(ProjectPostDto.ProjectPost::of)
                    .collect(Collectors.toList()))
            .build();
  }
}
