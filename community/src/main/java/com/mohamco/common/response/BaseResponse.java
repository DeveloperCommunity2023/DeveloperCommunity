package com.mohamco.common.response;

import com.mohamco.common.type.ApiStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class BaseResponse<T> {

  private String statusCode; // 상태코드
  private String message; // 메시지
  private T data; // 데이터

  @Builder
  public BaseResponse(
      String statusCode,
      String message,
      T data
  ) {
    // 성공하면 200, 그 외는 그에 맞는 상태코드 반환
    this.statusCode = StringUtils.isBlank(statusCode) ? "200" : statusCode;
    // 메시지가 있으면 그 메시지 반환, 없으면 그 상태코드에 맞는 메시지 반환
    this.message =
            StringUtils.isNotBlank(message) ? message
                    : ApiStatus.valueOfStatusCode(this.statusCode).getMessage();
    this.data = data; // 결과 데이터 반환
  }
}