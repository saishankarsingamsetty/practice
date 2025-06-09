package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Attendee;
import java.util.List;


public interface AttendeeRepository extends JpaRepository<Attendee, Integer> {

	List<Attendee> findByStatus(int status);
}
