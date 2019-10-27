import java.util.Calendar;
import java.util.Date;

public class DateTimeTwo {

	private Calendar calendar;
	private Date date;
	public DateTimeTwo() {
		calendar = Calendar.getInstance();
		date = new Date();
	}
	
	public void daysOfCurrentMonth() {
		// TODO Auto-generated method stub
		Date tempDate = (Date) date.clone();
		tempDate.setDate(11);		
		String tenthDay = "";
		String eighteenthDay = "";
		int dayOfWeek = tempDate.getDay();
		if (dayOfWeek == 1)
			tenthDay = "SUNDAY";
		if (dayOfWeek == 2)
			tenthDay = "MONDAY";
		if (dayOfWeek == 3)
			tenthDay ="TUESDAY";
		if (dayOfWeek == 4)
			tenthDay = "WEDNESDAY";
		if (dayOfWeek == 5)
			tenthDay = "THURSDAY";
		if (dayOfWeek == 6)
			tenthDay = "FRIDAY";
		if (dayOfWeek == 7)
			tenthDay = "SATURDAY";
		
		tempDate.setDate(19);	
		
		dayOfWeek = tempDate.getDay();
		if (dayOfWeek == 1)
			eighteenthDay = "SUNDAY";
		if (dayOfWeek == 2)
			eighteenthDay = "MONDAY";
		if (dayOfWeek == 3)
			eighteenthDay ="TUESDAY";
		if (dayOfWeek == 4)
			eighteenthDay = "WEDNESDAY";
		if (dayOfWeek == 5)
			eighteenthDay = "THURSDAY";
		if (dayOfWeek == 6)
			eighteenthDay = "FRIDAY";
		if (dayOfWeek == 7)
			eighteenthDay = "SATURDAY";
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
