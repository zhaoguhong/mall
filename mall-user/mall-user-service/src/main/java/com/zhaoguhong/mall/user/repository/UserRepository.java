package com.zhaoguhong.mall.user.repository;

import com.zhaoguhong.mall.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);

}
