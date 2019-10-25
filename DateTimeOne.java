import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	
	private Date date;
	
	public DateTimeOne() {
		date = new Date();
	}
	
	@Override
	int getValueOfSecond() {
		return date.getSeconds();
	}

	@Override
	void dateTimeNow() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("month/day/year hour:minute am/pm");
		System.out.println("Current Date/Time: " + );
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
		
	}

	@Override
	void dateTimeDifferentZone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void timeZoneHashMap() {
		// TODO Auto-generated method stub
		
	}
   
}