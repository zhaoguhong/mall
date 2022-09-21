package com.zhaoguhong.mall.user.api;

import com.zhaoguhong.mall.common.Response;
import com.zhaoguhong.mall.common.constant.ServiceNameConstant;
import com.zhaoguhong.mall.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaoguhong
 * @date 2022/9/20
 */
@FeignClient(name = ServiceNameConstant.USER)
public interface UserApi {

  @PostMapping("/user/add")
  Response<Void> addUser(@RequestBody User user);

  @GetMapping("/user/find")
  Response<User> findByUsename(@RequestParam(name = "username") String username);

}
