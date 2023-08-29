package com.mohamco.sample;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings("unchecked")
public class SampleService {
  private final SampleRepository sampleRepository;

  public SampleDto.SampleData test(String po) {
    //String po = "1";
    SampleEntity res = sampleRepository.findByPo(po);
    return SampleDto.SampleData.builder()
      .po(res.getPo())
      .name(res.getName())
      .build();
  }
}
