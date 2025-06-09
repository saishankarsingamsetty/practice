package com.runners;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.entities.Attendee;
import com.entities.Event;
import com.entities.Organizer;
import com.services.AttendeeService;
import com.services.EventService;
import com.services.OrganizerService;

@Component
public class EventManagementRunner implements ApplicationRunner {

	@Autowired
	Scanner scn;

	@Autowired
	EventService eventService;

	@Autowired
	OrganizerService organizerService;

	@Autowired
	AttendeeService attendeeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();

		outerLoop: while (true) {
			System.out.println();
			System.out.println(
					"=== Online Event Management System ===\r\n" + "1. Manage Events\r\n" + "2. Manage Organizers\r\n"
							+ "3. Manage Attendees\r\n" + "4. Registration / Unregistration\r\n" + "5. Exit");
			int option = Integer.parseInt(scn.nextLine());

			switch (option) {

			case 1: {
				manageEvents();
				break;
			}

			case 2: {
				manageOrganizers();
				break;
			}

			case 3: {
				manageAttendees();
				break;
			}
			case 4: {
				registerOrUnregister();
				break;
			}
			case 5: {

				break outerLoop;
			}

			default: {
				System.out.println("enter a valid option");
			}

			}// switch close

		} // outerloop

	}

	private void manageEvents() {
		while (true) {

			System.out.println("Manage Events\r\n" + "\r\n" + "1. Create Event\r\n" + "2. Update Event\r\n"
					+ "3. Delete Event\r\n" + "4. List All Events\r\n" + "5. View Event Details (by ID)\r\n"
					+ "6. View Attendees for an Event\r\n" + "7. Back to Main Menu");

			int option = Integer.parseInt(scn.nextLine());

			if (option == 1) {
				System.out.println("Enter event name");
				String name = scn.nextLine();
				System.out.println("Enter event description");
				String description = scn.nextLine();
				System.out.println("Enter event venue");
				String venue = scn.nextLine();
				System.out.println("Enter event date ");
				System.out.println("Enter year");
				int year = Integer.parseInt(scn.nextLine());
				System.out.println("Enter month in numeric form");
				int month = Integer.parseInt(scn.nextLine());
				System.out.println("Enter the day");
				int day = Integer.parseInt(scn.nextLine());

				Event event = new Event();
				event.setName(name);
				event.setDescription(description);
				event.setVenue(venue);
				event.setEventdate(LocalDate.of(year, month, day));
				event.setStatus(1);

				Event createdEvent = eventService.createNewEvent(event);

				if (createdEvent != null) {
					System.out.println("event created successfully");
					System.out.println(createdEvent);
				}
			} else if (option == 2) {
				System.out.println("enter the event id to update");
				int eventId = Integer.parseInt(scn.nextLine());

				Event event = eventService.getEventById(eventId);

				if (event != null) {
					System.out.println(event);
					System.out.println("Enter event name");
					String name = scn.nextLine();
					System.out.println("Enter event description");
					String description = scn.nextLine();
					System.out.println("Enter event venue");
					String venue = scn.nextLine();
					System.out.println("Enter event date ");
					System.out.println("Enter year");
					int year = Integer.parseInt(scn.nextLine());
					System.out.println("Enter month in numeric form");
					int month = Integer.parseInt(scn.nextLine());
					System.out.println("Enter the day");
					int day = Integer.parseInt(scn.nextLine());

					event.setName(name);
					event.setDescription(description);
					event.setVenue(venue);
					event.setEventdate(LocalDate.of(year, month, day));
					event.setStatus(1);

					Event newEvent = eventService.createNewEvent(event);
					System.out.println("event updated successfully");
					System.out.println(newEvent);
				} else {
					System.out.println("event not found with the id " + eventId);
				}
			} else if (option == 3) {
				System.out.println("enter the event id to delete");
				int eventId = Integer.parseInt(scn.nextLine());

				Event event = eventService.getEventById(eventId);

				if (event != null) {
					System.out.println(event);
					event.setStatus(0);
					Event newEvent = eventService.createNewEvent(event);
					if (newEvent.getStatus() == 0) {
						System.out.println("Event deleted succusfully");
					} else {
						System.out.println("failed to delete event");
					}
				} else {
					System.out.println("event not found with the id " + eventId);
				}
			} else if (option == 4) {
				List<Event> events = eventService.getAllEvents();
				if (events.isEmpty()) {
					System.out.println("no events to display");
				} else {

					events.forEach(System.out::println);
				}
			} else if (option == 5) {
				System.out.println("enter the event id to display");
				int eventId = Integer.parseInt(scn.nextLine());

				Event event = eventService.getEventById(eventId);
				if (event != null) {
					System.out.println(event);
				} else {
					System.out.println("event not found with the id " + eventId);
				}
			} else if (option == 6) {
				// view attendees for an event
				System.out.println("enter the event id to display attendees");
				int eventId = Integer.parseInt(scn.nextLine());

				Event event = eventService.getEventById(eventId);
				if (event != null) {
//					event.getAttendees().size();
					Set<Attendee> attendees = eventService.getAttendeesForEvent(eventId);
					if (attendees.isEmpty()) {
						System.out.println("no attendees for this event ");
					} else {
						attendees.forEach(System.out::println);
					}
				} else {
					System.out.println("event not found with the id " + eventId);
				}

			} else if (option == 7) {
				return;
			} else {
				System.out.println("enter a valid option");
			}
		} // loop
	}

	private void manageOrganizers() {
		while (true) {

			System.out.println("Manage Organizers\r\n" + "\r\n" + "1. Register New Organizer\r\n"
					+ "2. View All Organizers\r\n" + "3. View Events by Organizer ID\r\n" + "4. Back to Main Menu");

			int option = Integer.parseInt(scn.nextLine());

			if (option == 1) {
				System.out.println("Enter the organizer name ");
				String organizerName = scn.nextLine();
				System.out.println("Enter the organizer email");
				String organizerEmail = scn.nextLine();

				Organizer organizer = new Organizer();
				organizer.setName(organizerName);
				organizer.setMail(organizerEmail);
				organizer.setStatus(1);

				Organizer newOrganizer = organizerService.createNewOrganizer(organizer);
				if (newOrganizer != null) {

					System.out.println(newOrganizer);
					System.out.println("organizer created successfully");
				} else {
					System.out.println("organizer is not created");
				}
			} else if (option == 2) {
				List<Organizer> organizers = organizerService.getAllOrganizers();

				if (organizers.isEmpty()) {
					System.out.println("no organizers found");
				} else {
					organizers.forEach(System.out::println);
				}
			} else if (option == 3) {
				System.out.println("Enter the organizer id");

				int organizerId = Integer.parseInt(scn.nextLine());

				Organizer organizer = organizerService.getOrganizerById(organizerId);
				if (organizer != null) {
					Set<Event> events = organizerService.getEventsByOganizerId(organizer.getOid());
					if (events.isEmpty()) {
						System.out.println("no events found for the organizer");
					} else {
						events.forEach(System.out::println);
					}
				} else {
					System.out.println("organizer not found");
				}
			} else if (option == 4) {
				return;
			} else {
				System.out.println("Enter a valid option");
			}
		}
	}

	private void manageAttendees() {
		while (true) {

			System.out.println("Manage Attendees\r\n" + "\r\n" + "1. Register New Attendee\r\n"
					+ "2. View All Attendees\r\n" + "3. View Events by Attendee ID\r\n" + "4. Back to Main Menu");

			int option = Integer.parseInt(scn.nextLine());

			if (option == 1) {
				System.out.println("Enter the name of the attendee");
				String name = scn.nextLine();
				System.out.println("Enter the email of the attendee");
				String email = scn.nextLine();

				Attendee attendee = new Attendee();
				attendee.setName(name);
				attendee.setEmail(email);
				attendee.setStatus(1);

				Attendee newAttendee = attendeeService.createNewAttendee(attendee);

				if (newAttendee != null) {
					System.out.println(newAttendee);
					System.out.println("Attendee created succesfully");

				} else {
					System.out.println("attendee creation failure");
				}
			} else if (option == 2) {
				List<Attendee> attendees = attendeeService.getAllAttendees();
				if (attendees.isEmpty()) {
					System.out.println("attendees not found");
				} else {
					attendees.forEach(System.out::println);
				}
			} else if (option == 3) {

				System.out.println("Enter the attendee id to list all the events");
				int aid = Integer.parseInt(scn.nextLine());

				Attendee attendee = attendeeService.getAttendeeById(aid);

				if (attendee != null) {
					Set<Event> events = attendeeService.getEventsById(aid);
					if (events.isEmpty()) {
						System.out.println("events not exists");
					} else {
						events.forEach(System.out::println);
					}
				} else {
					System.out.println("Attendee not found with the id " + aid);
				}

			} else if (option == 4) {
				return;
			} else {
				System.out.println("Enter a valid option");
			}
		}
	}

	private void registerOrUnregister() {
		while (true) {

			System.out.println("Register or Unregister\r\n" + "\r\n" + "1. Register Attendee for Event\r\n"
					+ "2. Unregister Attendee from Event\r\n" + "3. Assign Organizer to Existing Event   \r\n"
					+ "4. Remove Organizer from Existing Event  \r\n" + "5. Back to Main Menu");

			int option = Integer.parseInt(scn.nextLine());
			if (option == 1) {
				System.out.println("Enter attendee id ");
				int aid = Integer.parseInt(scn.nextLine());

				System.out.println("Enter the event id");
				int eid = Integer.parseInt(scn.nextLine());

				Attendee attendee = attendeeService.getAttendeeById(aid);

				Event event = eventService.getEventById(eid);

				if (attendee != null && event != null) {
					boolean status = attendeeService.addEventToAttendee(aid, eid);
					if (status) {
						System.out.println("Event added successfully");

					} else {
						System.out.println("Adding event failure");
					}
				} else {
					System.out.println("enter the valid id values");
				}
			} else if (option == 2) {
				System.out.println("Enter attendee id ");
				int aid = Integer.parseInt(scn.nextLine());

				System.out.println("Enter the event id");
				int eid = Integer.parseInt(scn.nextLine());

				Attendee attendee = attendeeService.getAttendeeById(aid);

				Event event = eventService.getEventById(eid);

				if (attendee != null && event != null) {
					boolean status = attendeeService.removeEventFromAttendee(aid, eid);
					if (status) {
						System.out.println("event unregistered successfully");
					} else {
						System.out.println("unregistering event failure");
					}
				} else {
					System.out.println("Enter a valid id values");
				}
			} else if (option == 3) {
				System.out.println("Enter Organizer id");
				int oid = Integer.parseInt(scn.nextLine());
				System.out.println("Enter Event id ");
				int eid = Integer.parseInt(scn.nextLine());

				Organizer organizer = organizerService.getOrganizerById(oid);

				Event event = eventService.getEventById(eid);

				if (event != null && organizer != null) {
					boolean status = organizerService.addOrganizerToEvent(oid, eid);
					if (status) {
						System.out.println("organizer assigned to the event successfully");
					} else {
						System.out.println("assigning organizer to the event failure");
					}
				} else {
					System.out.println("enter valid id values ");
				}
			} else if (option == 4) {
				System.out.println("Enter Organizer id");
				int oid = Integer.parseInt(scn.nextLine());
				System.out.println("Enter Event id ");
				int eid = Integer.parseInt(scn.nextLine());

				Organizer organizer = organizerService.getOrganizerById(oid);

				Event event = eventService.getEventById(eid);

				if (event != null && organizer != null) {
					boolean status = organizerService.removeOrganizerFromEvent(oid, eid);
					if (status) {
						System.out.println("organizer removed to the event successfully");
					} else {
						System.out.println("removing organizer from the event failure");
					}
				} else {
					System.out.println("enter valid id values ");
				}
			} else if (option == 5) {
				return;
			} else {
				System.out.println("Enter a valid option");
			}
		}
	}

}
