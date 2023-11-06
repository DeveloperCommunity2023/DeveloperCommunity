package com.mohamco.post.repository;

import com.mohamco.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRegRepository extends JpaRepository<PostEntity, Long> {
}
