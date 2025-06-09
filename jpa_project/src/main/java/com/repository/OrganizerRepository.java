package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Organizer;
import java.util.List;


public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {

	List<Organizer> findByStatus(int status);
}
