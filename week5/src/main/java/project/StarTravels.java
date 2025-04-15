package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StarTravels implements BusBookingSystem {

	private PassengerDAO passengerDAO=new PassengerDAO();
	private ScheduleDAO scheduleDAO = new ScheduleDAO();
	private BookingsDAO bookingsDAO=new BookingsDAO();
	private BusDAO busDAO=new BusDAO();
	
	
	@Override
	public void viewAvailableBusses() {
		scheduleDAO.displayAllSchedules();
		
	}

	@Override
	public boolean bookTicket(int scheduleId,int passengerId,int seat) {
		Booking newBooking = new Booking();
		newBooking.setScheduleId(scheduleId);
		newBooking.setPassengerId(passengerId);
		newBooking.setSeatNum(seat);
		newBooking.setBookingDate(new Date());
		
		Booking booking = bookingsDAO.insertRecord(newBooking);
		System.out.println(booking);
		return booking.getBookingId()!=0;
		
	}

	@Override
	public void viewBookings(int userId) {
		if(passengerDAO.getUserById(userId)!=null) {
			
			bookingsDAO.viewBookingsByPassengerId(userId);
		}
	}

	@Override
	public boolean cancelBooking(int userId,int bookingId) {

		if(bookingsDAO.noOfBookingsByPassengerId(userId)>0) {
			return bookingsDAO.cancelBookingById(bookingId);
		}
		else {
			System.out.println("no bookings to cancel");
		}
		return false;
	}
	
	public boolean validateUser(int userId,String pwd) {
		Passenger passenger=passengerDAO.getUserById(userId);
		if(passenger!=null) {
			return passenger.getPwd().equals(pwd);	
		}
		return false;
	}
	
	public boolean addUser(String name,String email,long phnumber,String pwd) {
		Passenger passenger=passengerDAO.insertPassenger(name,email,phnumber,pwd);
		
		if(passenger!=null) {
			System.out.println("user created succesfully"); 
		}
		else {
			System.out.println("user not created");
		}
		
		return passenger!=null;
	}
	

	public List<Integer> validateBooking(int scheduleId){
		List<Integer> availableList=new ArrayList<>();
		if(scheduleDAO.getScheduleById(scheduleId)!=null) {
			int busId=scheduleDAO.getBusIdByScheduleId(scheduleId);
			int totalNoOfSeats=busDAO.getTotalSeatsById(busId);
			
			
			for(int i=1;i<=totalNoOfSeats; i++) {
				availableList.add(i);
			}
			
			List<Integer> bookedSeatNumbers=bookingsDAO.getBookedSeatNumbersByScheduleId(scheduleId);
			availableList.removeAll(bookedSeatNumbers);
			
		}
		else {
			System.out.println("schedule not found... please choose the schedule from the list");
		}
		
		return availableList;
		
	}
	
	public int noOfBookingsByUser(int userId) {
		return bookingsDAO.noOfBookingsByPassengerId(userId);
	}
	
	public void close() {
		passengerDAO.close();
		scheduleDAO.close();
		bookingsDAO.close();
		busDAO.close();
	}

}
