package com.zhaoguhong.mall.order.repository;

import com.zhaoguhong.mall.entity.Order;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

  List<Order> findByUserId(Long userId);

}
