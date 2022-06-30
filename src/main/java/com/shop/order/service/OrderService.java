package com.shop.order.service;

import com.shop.order.dto.OrderDto;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    OrderDto getOrder(Long id);
    OrderDto addOrder(OrderDto user);
    OrderDto updateOrder(OrderDto user);
    void deleteOrder(Long id);
}
