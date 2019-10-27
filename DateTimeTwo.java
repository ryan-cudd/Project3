import java.util.Calendar;
import java.util.Date;

public class DateTimeTwo {

	private Calendar calendar;
	public DateTimeTwo() {
		calendar = Calendar.getInstance();
	}
	
	public void daysOfCurrentMonth() {
		// TODO Auto-generated method stub
		Calendar tempCal = (Calendar) calendar.clone();
		tempCal.set(calendar.get(calendar.YEAR), calendar.get(calendar.MONTH), 10, calendar.get(calendar.HOUR), calendar.get(calendar.MINUTE));		
		String tenthDay = "";
		String eighteenthDay = "";
		switch (tempCal.DAY_OF_WEEK) {
		case 1:
			tenthDay = "SUNDAY";
		case 2:
			tenthDay = "MONDAY";
		case 3:
			tenthDay ="TUESDAY";
		case 4:
			tenthDay = "WEDNESDAY";
		case 5:
			tenthDay = "THURSDAY";
		case 6:
			tenthDay = "FRIDAY";
		case 7:
			tenthDay = "SATURDAY";
		}
		tempCal.set(calendar.get(calendar.YEAR), calendar.get(calendar.MONTH), 18, calendar.get(calendar.HOUR), calendar.get(calendar.MINUTE));
		System.out.println(calendar.MONTH);
		System.out.println(tempCal.get(tempCal.DAY_OF_MONTH));
		System.out.println(tempCal.get(tempCal.DAY_OF_WEEK));
		eighteenthDay = "ASDAS";
		switch (tempCal.get(tempCal.DAY_OF_WEEK)) {
		case 1:
			eighteenthDay = "SUNDAY";
		case 2:
			eighteenthDay = "MONDAY";
		case 3:
			eighteenthDay ="TUESDAY";
		case 4:
			eighteenthDay = "WEDNESDAY";
		case 5:
			eighteenthDay = "THURSDAY";
		case 6:
			eighteenthDay = "FRIDAY";
		case 7:
			eighteenthDay = "SATURDAY";
		}
		System.out.println("The tenth day of the month is " + tenthDay + " and the eighteenth is " + eighteenthDay);
	}

	public void daysOfAnyMonth(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void compareYear() {
		// TODO Auto-generated method stub
		
	}

	public void dateHashMap() {
		// TODO Auto-generated method stub
		
	}

	public void dateHashMapSorted() {
		// TODO Auto-generated method stub
		
	}

}
