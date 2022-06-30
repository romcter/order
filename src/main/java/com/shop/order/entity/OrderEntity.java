package com.shop.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode
public class OrderEntity {

    @Id
    private Long id;
    private String price;
    private TypeOfProduct type;
    private String isActive;

    //TODO  add relation with User
}
