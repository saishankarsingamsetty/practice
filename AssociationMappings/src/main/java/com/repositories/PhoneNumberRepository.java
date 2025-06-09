package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entitys.PhoneNumber;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {

	public PhoneNumber findByPhoneNumber(long phnum);
}
