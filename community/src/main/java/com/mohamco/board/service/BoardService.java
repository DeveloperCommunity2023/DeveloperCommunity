package com.mohamco.board.service;

import com.mohamco.board.dto.BoardDto;
import com.mohamco.board.entity.BoardEntity;
import com.mohamco.board.repository.BoardRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardService {
  private final BoardRepository boardRepository;

  /**
   * 게시글 리스트 반환
   */
  public List<BoardDto.PostList> getPostList(String boardSeq) {
    List<BoardEntity> boardEntity = boardRepository.findAllByBoardSeq(boardSeq);

    return boardEntity.stream()
            .map(BoardDto.PostList::of)
            .collect(Collectors.toList());
  }
}
