package com.javawebken.mystore.repository;

import com.javawebken.mystore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  Optional<Customer> findByEmail(String email);
  Optional<Customer> findByEmailOrMobileNumber(String email, String mobileNumber);
}