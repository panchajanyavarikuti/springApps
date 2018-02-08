package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeDetails {

	private static final long NO_MONTHS = 12;
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		LocalDate date = LocalDate.parse("2015-06-22");
		
		System.out.println(getExperience(date));
		System.out.println("For given date: "+date.format(format)+", Next Month 2nd Sunday: "+getNextMonth2ndSaturday(date,format));
		
	}

	private static String getExperience(LocalDate joinedDate) {
		LocalDate today = LocalDate.now();
		
		if(joinedDate.isBefore(today)){
			long years = ChronoUnit.YEARS.between(joinedDate, today);
			long months = ChronoUnit.MONTHS.between(joinedDate, today);
			long days = ChronoUnit.DAYS.between(joinedDate.plusMonths(months), today);
			
			months = Math.subtractExact(months,(years*NO_MONTHS));
			
			return years+" Years, "+months+" Months, "+days+" Days";	
		}
		return null;
	}

	private static String getNextMonth2ndSaturday(LocalDate dt,DateTimeFormatter format) {
		LocalDate date = dt.plusMonths(1);
		date = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		LocalDate saturday = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		return saturday.format(format);
	}
}
