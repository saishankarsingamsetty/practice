package com.entities;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Organizer {

	@Id
	@SequenceGenerator(name = "organizer_id_gen" ,initialValue = 3001 ,allocationSize = 1000 )
	@GeneratedValue(generator = "organizer_id_gen" , strategy = GenerationType.SEQUENCE)
	int oid;
	
	@Column(length = 20)
	String name;
	
	String mail;
	
	int status;
	
	@OneToMany(targetEntity = Event.class , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "organizer_id" ,referencedColumnName = "oid")
	Set<Event> events;

	@Override
	public String toString() {
		return "Organizer [oid=" + oid + ", name=" + name + ", mail=" + mail + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mail, name, oid, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organizer other = (Organizer) obj;
		return Objects.equals(mail, other.mail) && Objects.equals(name, other.name) && oid == other.oid
				&& status == other.status;
	}
	
	
}
