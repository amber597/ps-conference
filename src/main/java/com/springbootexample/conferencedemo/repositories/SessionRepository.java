package com.springbootexample.conferencedemo.repositories;

import com.springbootexample.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
