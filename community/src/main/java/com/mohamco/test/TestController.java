package com.mohamco.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/v1/test")
    public ResponseEntity<?> test() {
        TestDto.TestData t = testService.test();
        return ResponseEntity.ok(t);
    }

}
