package com.zhaoguhong.mall.common;

import java.io.Serializable;
import lombok.Data;

@Data
public class Response<T> implements Serializable {

  public static final Integer SUCCESS_CODE = 0;
  public static final Integer DEFAULT_FAIL_CODE = 1;

  /**
   * 返回编码
   */
  private Integer code;

  /**
   * 结果描述
   */
  private String message;

  /**
   * 实际结果
   */
  private T data;
  public static <T> Response<T> success() {
    Response<T> res = new Response<>();
    res.setCode(SUCCESS_CODE);
    return res;
  }

  public static <T> Response<T> success(T data) {
    Response<T> res = new Response<>();
    res.setCode(SUCCESS_CODE);
    res.setData(data);
    return res;
  }

  public static <T> Response<T> fail(int code, String message) {
    Response<T> res = new Response<>();
    res.setCode(code);
    res.setMessage(message);
    return res;
  }

  public static <T> Response<T> fail(String message) {
    Response<T> res = new Response<>();
    res.setCode(DEFAULT_FAIL_CODE);
    res.setMessage(message);
    return res;
  }

}
