package com.mohamco.board.repository;

import com.mohamco.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
  BoardEntity findByBoardSeq(String boardSeq);
}
