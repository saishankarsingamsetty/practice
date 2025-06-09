package com.entities;

import java.time.LocalDate;
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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Event {

	@Id
	@SequenceGenerator(name = "event_id_gen" ,initialValue = 2001 ,allocationSize = 100 )
	@GeneratedValue(generator = "event_id_gen" , strategy = GenerationType.SEQUENCE)
	int eid;
	
	@Column(length = 20)
	String name;
	
	

	String description;
	
	LocalDate eventdate;
	
	@Column(length= 20)
	String venue;
	
	int status;
	
	@ManyToOne(targetEntity = Organizer.class ,cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "organizer_id" ,referencedColumnName = "oid")
	Organizer organizer;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "events")
	Set<Attendee> attendees;
	
	@Override
	public String toString() {
		return "Event [eid=" + eid + ", name=" + name + ", description=" + description + ", eventdate=" + eventdate
				+ ", venue=" + venue + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, eid, eventdate, name, status, venue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return Objects.equals(description, other.description) && eid == other.eid
				&& Objects.equals(eventdate, other.eventdate) && Objects.equals(name, other.name)
				&& status == other.status && Objects.equals(venue, other.venue);
	}
	
}
