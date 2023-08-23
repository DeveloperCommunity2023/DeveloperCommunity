package com.mohamco.test;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "post")
public class TestEntity {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String po;

    @Column
    private String name;
}
