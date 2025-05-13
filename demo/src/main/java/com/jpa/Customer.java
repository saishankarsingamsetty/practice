package com.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_practice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@SequenceGenerator(name = "gen1" ,sequenceName = "customer_practice_seq" ,initialValue = 1001,allocationSize = 1)
	@GeneratedValue(generator = "gen1" ,strategy =  GenerationType.SEQUENCE)
	int id;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	String email;
}
