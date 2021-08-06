package com.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

