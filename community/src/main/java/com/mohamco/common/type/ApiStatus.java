package com.mohamco.common.type;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ApiStatus { // 상태코드 저장
  OK("200", "성공");

  private final String statusCode;
  private final String message;

  private static final Map<String, ApiStatus> API_STATUS_CODE =
          Stream.of(values())
                  .collect(Collectors.toMap(ApiStatus::getStatusCode, Function.identity()));

  private static final Map<String, ApiStatus> API_MESSAGE =
          Stream.of(values())
                  .collect(Collectors.toMap(ApiStatus::getMessage, Function.identity()));

  public static ApiStatus valueOfStatusCode(String code) {
    return API_STATUS_CODE.get(code);
  }

  public static ApiStatus valueOfMessage(String message) {
    return API_MESSAGE.get(message);
  }
}
