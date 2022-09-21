package com.zhaoguhong.mall.user.controller;

import com.zhaoguhong.mall.common.Response;
import com.zhaoguhong.mall.entity.User;
import com.zhaoguhong.mall.user.api.UserApi;
import com.zhaoguhong.mall.user.repository.UserRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoguhong
 * @date 2022/9/20
 */
@RestController
public class UserController implements UserApi {

  @Autowired
  private UserRepository userRepository;

  @Override
  public Response<Void> addUser(User user) {
    user.setPassword(UUID.randomUUID().toString().replace("-",""));
    userRepository.save(user);
    return Response.success();
  }

  @Override
  public Response<User> findByUsename(String username) {
    User user = userRepository.findByUsername(username);
    return Response.success(user);
  }
}
