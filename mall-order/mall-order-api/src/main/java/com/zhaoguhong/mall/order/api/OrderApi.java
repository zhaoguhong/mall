package com.zhaoguhong.mall.order.api;

import com.zhaoguhong.mall.common.Response;
import com.zhaoguhong.mall.common.constant.ServiceNameConstant;
import com.zhaoguhong.mall.entity.Order;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaoguhong
 * @date 2022/9/20
 */
@FeignClient(name = ServiceNameConstant.ORDER)
public interface OrderApi {

  @PostMapping("/order/create")
  Response<Void> createOrder(@RequestBody Order order);

  @GetMapping("/order/list")
  Response<List<Order>> orderList(@RequestParam(name = "userId") Long userId);

}
