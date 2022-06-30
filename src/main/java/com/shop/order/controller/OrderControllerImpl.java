package com.shop.order.controller;

import com.shop.order.dto.OrderDto;
import com.shop.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public class OrderControllerImpl implements OrderController {

    private final OrderService orderService;

    public OrderControllerImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    public ResponseEntity<OrderDto> get(Long id) {
        OrderDto order = orderService.getOrder(id);
        log.info("Returned order with id: {}", id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    public ResponseEntity<OrderDto> add(OrderDto personDto) {
        OrderDto order = orderService.addOrder(personDto);
        log.info("Order {} successfully added", order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    public ResponseEntity<OrderDto> update(OrderDto personDto) {
        OrderDto order = orderService.updateOrder(personDto);
        log.info("Order {} successfully update", order);
        return new ResponseEntity<>(order, HttpStatus.NO_CONTENT);
    }

    public ResponseEntity delete(Long id) {
        orderService.deleteOrder(id);
        log.debug("Order with id: {} successfully deleted", id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
