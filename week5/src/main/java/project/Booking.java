package project;

import java.util.Date;

public class Booking {
//	booking_id, passenger_id, schedule_id, booking_date, seat_num
	
	private int bookingId;
	private int scheduleId;
	private int passengerId;
	private Date bookingDate;
	private int seatNum;
	
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", scheduleId=" + scheduleId + ", passengerId=" + passengerId
				+ ", bookingDate=" + bookingDate + ", seatNum=" + seatNum + "]";
	}
	
}
