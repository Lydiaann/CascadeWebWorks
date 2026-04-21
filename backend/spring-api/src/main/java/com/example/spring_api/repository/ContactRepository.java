package com.example.spring_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_api.model.Contact;  

public interface ContactRepository extends JpaRepository<Contact, Long> {
}