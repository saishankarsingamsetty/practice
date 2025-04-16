package project;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StarTravels travels =new StarTravels();
		Scanner scn=new Scanner(System.in);
		outerloop:while(true) {
			System.out.println("1.login in");
			System.out.println("2.sign up");
			System.out.println("3.exit");
			
			int op =Integer.parseInt(scn.nextLine());
			
			switch(op) {
			case 1:
			{
				System.out.println("Enter user id");
				int userId=Integer.parseInt(scn.nextLine());
				System.out.println("Enter your password");
				String pwd=scn.nextLine();
				
				if(travels.validateUser(userId, pwd)) {
					innerLoop:while(true) {
						
						System.out.println("\nWelcome to the bus booking system\n\n");
						System.out.println("----------------------------------------");
						System.out.println(
								"1. View Available Buses\n"+
										"2. Book a Ticket\n"+
										"3. View My Bookings\n"+
										"4. Cancel Booking\n"+
								"5. Exit\n");
						int option=Integer.parseInt(scn.nextLine());
						
						switch(option) {
						case 1:
						{
							travels.viewAvailableBusses();
							break;
						}	
						case 2:
						{
							travels.viewAvailableBusses();
							System.out.println("Enter schedule id");
							int scId=Integer.parseInt(scn.nextLine());
							List<Integer> availableSeats = travels.validateBooking(scId);
							
							if(!availableSeats.isEmpty()) {
								
								System.out.println("choose seats from the list");
								System.out.println(availableSeats);
								int choosenSeat = Integer.parseInt(scn.nextLine());
								if(availableSeats.contains(choosenSeat)) {
									
									if(travels.bookTicket(scId, userId,choosenSeat)) {
										System.out.println("ticket booked");
									}
									else {
										System.out.println("ticket not booked");
									}
								}
								else {
									System.out.println("enter the seat from the list");
								}
							}
							break;
						}
							
							
						case 3:
							travels.viewBookings(userId);
							
							break;
							
						case 4:
							if(travels.noOfBookingsByUser(userId)>0) {
								
								travels.viewBookings(userId);
								System.out.println("Enter the booking id you want to cancel");
								int bookingId=Integer.parseInt(scn.nextLine());
								if(travels.cancelBooking(userId,bookingId)) {
									System.out.println("booking cancelled");
								}
								else
									System.out.println("failed to cancel");
							}
							else {
								System.out.println("no bookings to cancel");
							}
							break;
							
						case 5:
							System.out.println("......");
							break innerLoop;
							
						default:
							System.out.println("Enter a valid option");
							break;
						}
					}
				}
				else {
					System.out.println("user not found try again");
				}
				
				break;
			}
				
			case 2:
			{
				System.out.println("Enter your name ");
				String name =scn.nextLine();
				System.out.println("Enter your email");
				String email=scn.nextLine();
				System.out.println("Enter your  mobile number");
				long number =Long.parseLong(scn.nextLine());
				System.out.println("Enter your pass word");
				String pwd = scn.nextLine();
				travels.addUser(name, email, number, pwd);
				break;
			}
				
			case 3:
				System.out.println("......");
				scn.close();
				travels.close();
				break outerloop;
				
			default:
				System.out.println("enter a valid option ");
				break;
				
			}
			
		}
	}
}
