package project;

import java.time.LocalDateTime;

public class Schedule {
	
	private int scheduleId;
	private int busId;
	private int routeId;
	private LocalDateTime departureTime;

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", busId=" + busId + ", routeId=" + routeId + ", departureTime="
				+ departureTime + "]";
	}
	
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	
}
