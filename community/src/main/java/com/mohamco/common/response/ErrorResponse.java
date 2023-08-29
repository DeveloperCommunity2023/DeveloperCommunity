package com.mohamco.common.response;

import com.mohamco.common.type.ApiStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class ErrorResponse {

  private String statusCode;
  private String message;

  @Builder
  ErrorResponse(
          String statusCode,
          String message
  ) {
    this.statusCode = statusCode; // 상태코드
    this.message =
            StringUtils.isNotBlank(message) ? message
                    : ApiStatus.valueOfStatusCode(statusCode).getMessage(); // 메시지
  }
}