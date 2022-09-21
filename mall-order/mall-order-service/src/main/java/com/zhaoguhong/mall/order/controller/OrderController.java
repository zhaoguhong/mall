package com.zhaoguhong.mall.order.controller;

import com.google.common.collect.Lists;
import com.zhaoguhong.mall.common.Response;
import com.zhaoguhong.mall.entity.Order;
import com.zhaoguhong.mall.entity.User;
import com.zhaoguhong.mall.order.api.OrderApi;
import com.zhaoguhong.mall.order.repository.OrderRepository;
import com.zhaoguhong.mall.user.api.UserApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoguhong
 * @date 2022/9/20
 */
@RestController
public class OrderController implements OrderApi {

  @Autowired
  private UserApi userApi;

  @Autowired
  private OrderRepository orderRepository;

  @Override
  public Response<Void> createOrder(Order order) {
    Response<User> user = userApi.findByUsename(order.getUsername());
    order.setUserId(user.getData().getId());
    orderRepository.save(order);
    return Response.success();
  }

  @Override
  public Response<List<Order>> orderList(Long userId) {
    List<Order> orders = orderRepository.findByUserId(userId);
    System.out.println(orders);
    return Response.success(orders);
  }
}
