package com.kurkul.kubikdemo.repositories;

import com.kurkul.kubikdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
