package com.mohamco.sample;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SampleDto {

  @Getter
  @Builder
  public static class SampleData {
    private String po;
    private String name;
  }

}
