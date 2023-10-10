package com.geekster.bidirectional_m_1_1_m.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserOrder")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, scope = Order.class, property = "orderId")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String orderName;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order")
    List<Product> product;
}
