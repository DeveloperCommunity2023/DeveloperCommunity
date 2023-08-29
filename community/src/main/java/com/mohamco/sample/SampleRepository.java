package com.mohamco.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

  SampleEntity findByPo(String po);
}
