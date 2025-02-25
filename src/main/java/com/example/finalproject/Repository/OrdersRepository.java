package com.example.finalproject.Repository;

import com.example.finalproject.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    Orders findOrdersById(Integer id);
}
