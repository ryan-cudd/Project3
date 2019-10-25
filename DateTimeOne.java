import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	
	private Date date;
	private Calendar calendar;
	private HashMap<String, String> dateHash;
	
	public DateTimeOne() {
		date = new Date();
		dateHash = new HashMap<String, String>();
		calendar = Calendar.getInstance();
	}
	
	@Override
	int getValueOfSecond() {
		return date.getSeconds();
	}

	@Override
	void dateTimeNow() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY HH:mm a");
		System.out.println("Current Date/Time: " + dateFormat.format(date.getTime()));
	}

	@Override
	void sleepForFiveSec(){
		try{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
		}
		
	}

	@Override
	void dateTimeOfOtherCity() {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		System.out.print("Time on Server: " + dateFormat.format(date.getTime()) + "\n");
		System.out.println("GMT: " + (date.getHours() + 6)%24 +":" + date.getMinutes());
		System.out.println("BST (90E): " + (date.getHours() + 12)%24 +":" + date.getMinutes());
		System.out.println("CST (90W): " + date.getHours() + ":" + date.getMinutes());
		
	}

	@Override
	void dateTimeDifferentZone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void timeZoneHashMap() {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/YYYY HH:mm");
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("MM/dd/YYYY HH:mm");
		SimpleDateFormat dateFormat5 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		
		Calendar tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, 14);
		System.out.println("Print Style 1:");
		System.out.println("AST " + dateFormat1.format(tempCal.getTime()));
		dateHash.put("AST", dateFormat1.format(tempCal.getTime()));
		
		tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, 12);
		System.out.println("BST " + dateFormat1.format(tempCal.getTime()));
		dateHash.put("BST", dateFormat1.format(tempCal.getTime()));
		
		System.out.println("CST " + dateFormat1.format(calendar.getTime()));
		dateHash.put("CST", dateFormat1.format(calendar.getTime()));
		
		tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, 6);
		System.out.println("GMT " + dateFormat1.format(tempCal.getTime()));
		dateHash.put("GMT", dateFormat1.format(tempCal.getTime()));
		
		tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println("ZST " + dateFormat1.format(tempCal.getTime()));
		dateHash.put("ZST", dateFormat1.format(tempCal.getTime()));
		
		
		tempCal.add(Calendar.HOUR_OF_DAY, 14);
		System.out.println("Print Style 2:");
		System.out.println(dateFormat1.format(tempCal.getTime()));
		dateHash.put("AST", dateFormat1.format(tempCal.getTime()));
		
		tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, 12);
		System.out.println(dateFormat1.format(tempCal.getTime()));
		dateHash.put("BST", dateFormat1.format(tempCal.getTime()));
		
		System.out.println(dateFormat1.format(calendar.getTime()));
		dateHash.put("CST", dateFormat1.format(calendar.getTime()));
		
		tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, 6);
		System.out.println(dateFormat1.format(tempCal.getTime()));
		dateHash.put("GMT", dateFormat1.format(tempCal.getTime()));
		
		tempCal = (Calendar) calendar.clone();
		tempCal.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(dateFormat1.format(tempCal.getTime()));
		dateHash.put("ZST", dateFormat1.format(tempCal.getTime()));
		
		System.out.println(calendar.getTime());
	}
	
   
}