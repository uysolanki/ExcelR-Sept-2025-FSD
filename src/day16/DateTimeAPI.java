package day16;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimeAPI {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		
		
		int year=2012;
		int month=8;
		int day=22;
		LocalDate date1=LocalDate.of(year, month,day);
		System.out.println(date1);
		
		LocalDateTime dt = LocalDateTime.of(2025, 11, 13, 10,30,05);
		System.out.println(dt);
		
		LocalDate borrowDate=LocalDate.now();
		
		LocalDate returnDate=borrowDate.plusDays(14);
		
		System.out.println(returnDate);
		
		
		LocalDate todaysDate=LocalDate.now();
		
		//String s=todaysDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		String s=todaysDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(s);
		
		String strDate="2026/11/08";
		
		LocalDate diwali2026=LocalDate.parse(strDate,DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(diwali2026);
		
		String s1=diwali2026.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
		System.out.println(s1);
		String arr[]=s1.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		LocalDate nextflixSubscriptionDate=LocalDate.now();
		LocalDate nextflixSubscriptionexpiryDate=nextflixSubscriptionDate.plusYears(1);
		
		System.out.println(nextflixSubscriptionexpiryDate);
		
		LocalDate christmas2027 = LocalDate.of(2027, 12, 25);
		if(nextflixSubscriptionexpiryDate.isAfter(christmas2027))
			System.out.println("Valid Subscription");
		else
			System.out.println("Expired Subscription");
		
		
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zdt = ZonedDateTime.now(zone);
		
		System.out.println(zdt);
		
		
		 	ZoneId india = ZoneId.of("Asia/Kolkata");
	        ZoneId london = ZoneId.of("Europe/London");
	        ZoneId newYork = ZoneId.of("America/New_York");
	        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
	        ZoneId dubai = ZoneId.of("Asia/Dubai");
	        ZoneId singapore = ZoneId.of("Asia/Singapore");
	        ZoneId sydney = ZoneId.of("Australia/Sydney");
	        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");

	        System.out.println("India:        " + ZonedDateTime.now(india));
	        System.out.println("London:       " + ZonedDateTime.now(london));
	        System.out.println("New York:     " + ZonedDateTime.now(newYork));
	        System.out.println("Tokyo:        " + ZonedDateTime.now(tokyo));
	        System.out.println("Dubai:        " + ZonedDateTime.now(dubai));
	        System.out.println("Singapore:    " + ZonedDateTime.now(singapore));
	        System.out.println("Sydney:       " + ZonedDateTime.now(sydney));
	        System.out.println("Los Angeles:  " + ZonedDateTime.now(losAngeles));
	        
	        ZonedDateTime india1 =
	                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	        
	        System.out.println("India:        " + india1.getOffset());
	        
	        //Period is difference id Date
	        LocalDate start = LocalDate.of(2020, 1, 1);
	        LocalDate end = LocalDate.of(  2025, 1, 1);

	        Period p = Period.between(start, end);
	        System.out.println(p.getDays());  // 5
	        
	        
	        //Duration → Difference in time (Hours, Minutes, Seconds)
	        LocalTime t1 = LocalTime.of(10, 0);
	        LocalTime t2 = LocalTime.of(12, 30);

	        Duration d = Duration.between(t1, t2);
	        System.out.println(d.toHours()); // 2
	        System.out.println(d.toMinutes()); // 150
	        
	}

}
