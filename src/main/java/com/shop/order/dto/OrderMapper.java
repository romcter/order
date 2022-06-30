package com.shop.order.dto;

import com.shop.order.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper( OrderMapper.class );

    OrderDto orderToOrderDto(OrderEntity order);
    OrderEntity orderDtoToOrder(OrderDto orderDto);

}