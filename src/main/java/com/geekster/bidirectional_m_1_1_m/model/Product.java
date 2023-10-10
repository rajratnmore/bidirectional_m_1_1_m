package com.geekster.bidirectional_m_1_1_m.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, scope = PreUpdate.class, property = "productId")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;

    @Enumerated(value = EnumType.STRING)
    private Category productCategory;

    @ManyToOne
    @JoinColumn(name = "fk_order_id")
    Order order;
}
