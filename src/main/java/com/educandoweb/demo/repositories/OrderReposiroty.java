package com.educandoweb.demo.repositories;

import com.educandoweb.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReposiroty extends JpaRepository<Order,Long> {
}
