package day23passbyvaluedatdt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {

	public static void main(String[] args) {
		
		
		//How to get current date
		
		System.out.println(LocalDate.now());//2020-06-30
		
		//How to get future dates.
		LocalDate date1 = LocalDate.now();
		date1.plusDays(5);
		System.out.println(date1.plusDays(5));//2020-07-05
		date1.plusMonths(4);
		System.out.println(date1.plusMonths(4));//2020-10-30
		date1.plusYears(3);
		System.out.println(date1.plusYears(3));//2023-06-30
		
		//How to get past dates
		date1.minusDays(7);
		System.out.println(date1.minusDays(7)); //2020-06-23
		date1.minusMonths(2);
		System.out.println(date1.minusMonths(2));//2020-04-30
		date1.minusYears(5);
		System.out.println(date1.minusYears(5));//2015-06-30
		
		//How to get current time
		LocalTime.now();
		System.out.println(LocalTime.now());//18:17:46.045 ===>045 is nanoseconds
		
		//How to get future times
		LocalTime time1 = LocalTime.now();
		time1.plusSeconds(5);
		System.out.println(time1.plusSeconds(5));//18:20:00.435 it is chancing depending of time
		time1.plusMinutes(2);
		System.out.println(time1.plusMinutes(2));//18:24:06.210 and now time is 18:22
		time1.plusHours(4);
		System.out.println(time1.plusHours(4));//22:23:58.078
		
		//How to get past times
		
		time1.minusSeconds(5);
		System.out.println(time1.minusSeconds(5));//18:25:43.969 it is chancing depending of time
		time1.minusMinutes(2);
		System.out.println(time1.minusMinutes(2));//18:24:06.210 
		time1.plusHours(4);
		System.out.println(time1.minusHours(4));//14:25:48.969
		
		//How to get date and time together
		LocalDateTime.now();
		System.out.println(LocalDateTime.now());//2020-06-30T18:28:20.286==> T stands for time 
		
		
		
		
		

	}

}
