package com.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Event;
import com.entities.Organizer;
import com.repository.OrganizerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrganizerService {

	@Autowired
	OrganizerRepository organizerRepository;
	
	@Autowired
	EventService eventService;
	
	public Organizer createNewOrganizer(Organizer organizer) {
		return organizerRepository.save(organizer);
	}
	
	public List<Organizer> getAllOrganizers(){
		return organizerRepository.findByStatus(1);
	}
	
	public Organizer getOrganizerById(int oid) {
		Organizer organizer = organizerRepository.findById(oid).orElse(null);
		return organizer!=null&&organizer.getStatus()!=0?organizer:null;
	}
	
	public Set<Event> getEventsByOganizerId(int oid){
		Organizer organizer = getOrganizerById(oid);
		organizer.getEvents().size();
		return organizer.getEvents();
	}
	
	public boolean addOrganizerToEvent(int oid , int eid) {
		Organizer organizer = getOrganizerById(oid);
		Event event = eventService.getEventById(eid);
		int initialSize = organizer.getEvents().size();
		
		Set<Event> events = organizer.getEvents();
		
		if(events.contains(event)) {
			return false;
		}
		else{
			events.add(event);
			organizer.setEvents(events);
			Organizer newOrganizer = createNewOrganizer(organizer);
			
			return newOrganizer.getEvents().size()>initialSize;
		}
	}
	
	public boolean removeOrganizerFromEvent(int oid , int eid) {
		Organizer organizer = getOrganizerById(oid);
		Event event = eventService.getEventById(eid);
		int initialSize = organizer.getEvents().size();
		
		Set<Event> events = organizer.getEvents();
		
		if(events.contains(event)) {
			events.remove(event);
			organizer.setEvents(events);
			Organizer newOrganizer = createNewOrganizer(organizer);
			return newOrganizer.getEvents().size()<initialSize;
		}
		else{
			return false;

		}
	}
	
}
