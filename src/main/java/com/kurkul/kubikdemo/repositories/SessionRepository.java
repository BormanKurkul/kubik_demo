package com.kurkul.kubikdemo.repositories;

import com.kurkul.kubikdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {


}
