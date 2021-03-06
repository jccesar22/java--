package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room number");
		int number = sc.nextInt();
		System.out.println("Check-in date  (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date  (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation : " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation");

			System.out.println("Check-in date  (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date  (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());

			// atualiza o check- in ? o check-out
			String error = reservation.UpdateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Erro in reservation :" + error);
			}else {
			System.out.println("Reservation : " + reservation);
			}
		}

		sc.close();

	}

}
