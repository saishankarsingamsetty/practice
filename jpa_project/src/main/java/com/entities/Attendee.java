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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Attendee {

	@Id
	@SequenceGenerator(name = "attendee_id_gen" ,initialValue = 1001 ,allocationSize = 1000 )
	@GeneratedValue(generator = "attendee_id_gen" , strategy = GenerationType.SEQUENCE)
	int aid;
	
	@Column(length = 20)
	String name;
	
	@Column(length = 20)
	String email;
	
	int status;
	
	@ManyToMany(targetEntity = Event.class ,cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	@JoinTable(name = "Attendee_Event",joinColumns = @JoinColumn(name = "Attendee_id" ,referencedColumnName = "aid"),
	inverseJoinColumns = @JoinColumn(name = "Event_id",referencedColumnName = "eid"))
	Set<Event> events ;

	@Override
	public String toString() {
		return "Attendee [aid=" + aid + ", name=" + name + ", email=" + email + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aid, email, name, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendee other = (Attendee) obj;
		return aid == other.aid && Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& status == other.status;
	}
	
}
