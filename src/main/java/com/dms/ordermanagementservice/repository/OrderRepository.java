package com.dms.ordermanagementservice.repository;

import com.dms.ordermanagementservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {}
