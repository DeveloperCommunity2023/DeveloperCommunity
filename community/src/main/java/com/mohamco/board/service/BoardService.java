package com.mohamco.board.service;

import com.mohamco.board.dto.BoardDto;
import com.mohamco.board.entity.BoardEntity;
import com.mohamco.board.repository.BoardRepository;
import com.mohamco.board.repository.PostRepository;
import com.mohamco.post.entity.PostEntity;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardService {
  private final PostRepository postRepository;
  private final BoardRepository boardRepository;

  /**
   * 게시글 리스트 반환
   */
  public BoardDto.Response getPostList(String boardSeq) {
    return getBoardList(boardSeq);
  }

  public BoardDto.Response getBoardList(String boardSeq) {
    BoardEntity b = boardRepository.findByBoardSeq(boardSeq);
    List<PostEntity> p = postRepository.findAllByBoardSeq(boardSeq);



    return BoardDto.Response.builder()
            .boardSeq(b.getBoardSeq())
            .boardName(b.getBoardName())
            .boardDesc(b.getBoardDesc())
            .postList(p.stream()
                .map(BoardDto.PostList::of)
                .sorted(Comparator.comparing(BoardDto.PostList::getPostSeq).reversed())
                .collect(Collectors.toList()))
            .build();

  }
}
