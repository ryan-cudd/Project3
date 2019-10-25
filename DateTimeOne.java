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
		SimpleDateFormat dateFormat5 = new SimpleDateFormat("YYYY-MM-ddTHH:mm");
		Calendar tempCal = calendar;
		tempCal.add(Calendar.HOUR_OF_DAY, 14);
		
	}
	
	
   
}