package com.mohamco.test;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestDto.TestData test() {
        String po = "1";
        TestEntity res = testRepository.findByPo(po);
        return TestDto.TestData.builder()
                .po(res.getPo())
                .name(res.getName())
                .build();
    }
}
