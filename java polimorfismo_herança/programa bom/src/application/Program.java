package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.management.RuntimeMBeanException;

import model.entities.Reservation;
import model.exeception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Room number");
			int number = sc.nextInt();
			System.out.println("Check-in date  (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date  (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation : " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation");

			System.out.println("Check-in date  (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date  (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			reservation.UpdateDates(checkIn, checkOut);
			System.out.println("Reservation : " + reservation);
			
		} 
		catch (ParseException e) {
			// TODO: handle exception
			System.out.println("Ivalid date format");
		}
		catch (DomainException e) {
			// TODO: handle exception
			System.out.println("Error in reservation: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("unexpected error");
		}

		sc.close();

	}
}
