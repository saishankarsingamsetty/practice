package com.jpa.findermethods;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "abc")
//@IdClass(Integer.class)
@RequiredArgsConstructor
public class Emp {

	@Id
	@SequenceGenerator(name = "empgen", sequenceName = "emp_id_seq", initialValue = 2002, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empgen")
	@NonNull
	int id;
	@Column(length = 20)
	@NonNull
	String name;
	@NonNull
	int age;
	@NonNull
	double marks;
	
	@Version
	int updateCount;
	
	@CreationTimestamp
	@Column(updatable = false)
	LocalDateTime createdDate;
	
	@UpdateTimestamp
	LocalDateTime updatedDate;

}
