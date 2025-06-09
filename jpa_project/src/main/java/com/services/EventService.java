package com.services;

import java.util.HashSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Attendee;
import com.entities.Event;
import com.repository.EventRepository;

@Service
@Transactional
public class EventService {

	@Autowired
	EventRepository eventRepo;
	
	public Event createNewEvent(Event event) {
		return eventRepo.save(event);
	}
	
//	@Transactional
	public Event getEventById(int eventId) {
		Event event = eventRepo.findById(eventId).orElse(null);
		return event!=null&&event.getStatus()!=0?event:null;
	}
	
	public List<Event> getAllEvents(){
		return eventRepo.findByStatus(1);
	}
	
//	@Transactional
	public Set<Attendee> getAttendeesForEvent(int eventId) {
        Event event =getEventById(eventId);
        event.getAttendees().size();
        return event.getAttendees();
    }
}
