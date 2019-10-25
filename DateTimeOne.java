import java.time.LocalDateTime;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	
	private LocalDateTime localDate;
	
	public DateTimeOne() {
		localDate = LocalDateTime.now();
	}
	
	@Override
	int getValueOfSecond() {
		return localDate.getSecond();
	}

	@Override
	void dateTimeNow() {
		// TODO Auto-generated method stub
		
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