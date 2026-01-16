package com.javawebken.mystore.repository;

import com.javawebken.mystore.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}