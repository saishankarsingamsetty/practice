package com.services;

import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Attendee;
import com.entities.Event;
import com.repository.AttendeeRepository;

@Service
@Transactional
public class AttendeeService {

	@Autowired
	EventService eventService;

	@Autowired
	AttendeeRepository attendeeRepository;

	public Attendee createNewAttendee(Attendee attendee) {
		return attendeeRepository.save(attendee);
	}

	public Attendee getAttendeeById(int aid) {
		Attendee attendee = attendeeRepository.findById(aid).orElse(null);

		return attendee != null && attendee.getStatus() != 0 ? attendee : null;
	}

	public List<Attendee> getAllAttendees() {
		return attendeeRepository.findByStatus(1);
	}

	public Set<Event> getEventsById(int aid) {
		Attendee attendee = getAttendeeById(aid);
		attendee.getEvents().size();
		return attendee.getEvents();
	}

	public boolean addEventToAttendee(int aid, int eid) {
		Attendee attendee = getAttendeeById(aid);
		Event event = eventService.getEventById(eid);

		int intialSize = attendee.getEvents().size();

		Set<Event> events = attendee.getEvents();

		if (events.contains(event)) {
			return false;
		} else {
			events.add(event);
			attendee.setEvents(events);
			Attendee newAttendee = createNewAttendee(attendee);
			return newAttendee.getEvents().size() > intialSize;
		}
	}

	public boolean removeEventFromAttendee(int aid, int eid) {
		Attendee attendee = getAttendeeById(aid);
		Event event = eventService.getEventById(eid);

		int intialSize = attendee.getEvents().size();

		Set<Event> events = attendee.getEvents();

		if (events.contains(event)) {
			events.remove(event);
			attendee.setEvents(events);
			Attendee newAttendee = createNewAttendee(attendee);
			return newAttendee.getEvents().size() < intialSize;
		} else {
			return false;
		}
	}
}
