package com.educandoweb.demo.repositories;

import com.educandoweb.demo.entities.Order;
import com.educandoweb.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemReposiroty extends JpaRepository<OrderItem,Long> {
}
