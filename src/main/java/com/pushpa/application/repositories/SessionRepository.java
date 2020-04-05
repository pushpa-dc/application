package com.pushpa.application.repositories;

import com.pushpa.application.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}
