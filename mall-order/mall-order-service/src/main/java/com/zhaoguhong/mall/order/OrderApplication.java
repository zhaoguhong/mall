package com.zhaoguhong.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhaoguhong
 * @date 2022/9/20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = "com.zhaoguhong.mall.entity")
@EnableFeignClients(basePackages = {"com.zhaoguhong.mall"})
public class OrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class, args);
  }

}
