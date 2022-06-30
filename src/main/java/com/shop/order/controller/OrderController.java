package com.shop.order.controller;

import com.shop.order.dto.OrderDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public interface OrderController {

    @GetMapping("/{id}")
    @ApiOperation(value = "Finds order by id", response = OrderDto.class)
    ResponseEntity<OrderDto> get(@PathVariable Long id);

    @PostMapping
    @ApiOperation(value = "Add new order", response = OrderDto.class)
    ResponseEntity<OrderDto> add(@RequestBody OrderDto personDto);

    @PutMapping
    @ApiOperation(value = "Update order")
    ResponseEntity<OrderDto> update(@RequestBody OrderDto personDto);

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete order")
    ResponseEntity delete(@PathVariable Long id);
}
