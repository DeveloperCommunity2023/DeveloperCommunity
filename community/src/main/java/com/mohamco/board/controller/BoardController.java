package com.mohamco.board.controller;

import com.mohamco.board.service.BoardService;
import com.mohamco.common.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
  private final BoardService boardService;

  /**
   *
   * @param boardSeq (게시판 아이디)
   * @return 게시글 리스트를 반환한다
   */
  @GetMapping("/v1/{boardSeq}")
  public ResponseEntity<?> getBoard(@PathVariable("boardSeq") String boardSeq) {
    return ResponseEntity.ok(BaseResponse.builder()
            .data(boardService.getPostList(boardSeq)).build());
  }
}
