package com.mohamco.board.repository;

import com.mohamco.board.entity.BoardEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

  List<BoardEntity> findAllByBoardSeq(String boardSeq);

}
