package com.mohamco.sample;

import com.mohamco.common.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@SuppressWarnings("unchecked")
public class SampleController {
  private final SampleService sampleService;

  @GetMapping("/v1/test")
  public ResponseEntity<?> test() {
    SampleDto.SampleData t = sampleService.test("3");
    return ResponseEntity.ok(BaseResponse.builder().data(t).build());
  }
}
