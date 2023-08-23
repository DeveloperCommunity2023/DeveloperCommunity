package com.mohamco.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

    TestEntity findByPo(String po);
}
