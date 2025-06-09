package com.spring.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "ORMPEAC")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrmPrac {

	@Id
	int id;
	@Column(length = 20)
	String name;
	
	int age;
	
}
