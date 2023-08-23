package com.mohamco.test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class TestDto {

    @Getter
    @Builder
    public static class TestData{
        private String po;
        private String name;
    }
}
