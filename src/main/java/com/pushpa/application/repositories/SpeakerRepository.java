package com.pushpa.application.repositories;

import com.pushpa.application.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
