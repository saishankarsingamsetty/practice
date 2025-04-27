package com.StudentCourseManagementSystem;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable{
	
	private int id;
	private String name;
	private double fee;
	private int duration;
	
	@Override
	public int hashCode() {
		return Objects.hash(duration, fee, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return duration == other.duration && Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee)
				&& id == other.id && Objects.equals(name, other.name);
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fee=" + fee + ", duration=" + duration + "]";
	}

	public Course(int id, String name, double fee, int duration) {
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.duration = duration;
	}
	
	
}
