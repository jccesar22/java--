package calander;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class calendarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("ss/MM/yyyy HH:mm:ss");
		 Date d = Date.from(Instant.parse("2017-06-25T15:42:07Z"));
		 
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		int minuto = cal.get(Calendar.MINUTE);
		int segundo = cal.get(Calendar.SECOND);
		int month = 1 + cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		
		System.out.println("dia "+ day);
		System.out.println(month);
		System.out.println(minuto);
		System.out.println(segundo);
		System.out.println(sdf.format(d));
	}

}
