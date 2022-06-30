package com.shop.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    @ApiModelProperty(notes = "The unique id of the user", example = "13", required = true)
    private Long id;
    @ApiModelProperty(notes = "The price of order", example = "140")
    private String price;
    @ApiModelProperty(notes = "Type of product", example = "TOY")
    private String type;
    @ApiModelProperty(notes = "Is available for sale", example = "true")
    private boolean isAvailable = true;

}
