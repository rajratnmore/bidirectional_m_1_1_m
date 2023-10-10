package com.geekster.bidirectional_m_1_1_m.repo;

import com.geekster.bidirectional_m_1_1_m.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Integer> {
}
