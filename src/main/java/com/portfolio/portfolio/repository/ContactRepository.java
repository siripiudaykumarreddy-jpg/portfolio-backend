package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
