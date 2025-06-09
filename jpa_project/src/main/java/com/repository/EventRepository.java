package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Event;
import java.util.List;


public interface EventRepository extends JpaRepository<Event, Integer> {

	List<Event> findByStatus(int status);
}
