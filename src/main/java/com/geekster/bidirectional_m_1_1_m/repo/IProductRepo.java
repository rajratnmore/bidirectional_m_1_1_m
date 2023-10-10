package com.geekster.bidirectional_m_1_1_m.repo;

import com.geekster.bidirectional_m_1_1_m.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo  extends JpaRepository<Product, Long> {
}
