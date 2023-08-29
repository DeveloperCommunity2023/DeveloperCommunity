package com.mohamco.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;


@Getter
@Entity
@Table(name = "post")
public class SampleEntity {

  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private String po;

  @Column
  private String name;
}
