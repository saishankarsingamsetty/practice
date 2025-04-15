package project;

public interface BusBookingSystem {

	public void viewAvailableBusses();
	public boolean bookTicket(int scheduleId,int passengerId ,int seat);
	public void viewBookings(int userId);
	public boolean cancelBooking(int userId,int bookingId);
}
