
public class DateTimeOne extends MesoDateTimeOneAbstract
{
	
	private static final int MINUTE_AND_HOUR_CONVERSION = 60;
	private static final long MILLI_CONVERSION = 1000;
	private long milliSeconds;
	
	public DateTimeOne() {
		milliSeconds = System.currentTimeMillis();
	}
	
	public long getSeconds() {
		return milliSeconds / MILLI_CONVERSION;
	}
	
	@Override
	int getValueOfSecond() {
		return (int) (getSeconds() % MINUTE_AND_HOUR_CONVERSION);
	}
	
	public long getMinutes() {
		return getSeconds() / MINUTE_AND_HOUR_CONVERSION;
	}
	
	public long getHours() {
		return getMinutes() / MINUTE_AND_HOUR_CONVERSION;
	}
	
	public long getCurrentMinutes() {
		return getMinutes() % MINUTE_AND_HOUR_CONVERSION;
	}

	@Override
	void dateTimeNow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sleepForFiveSec() {
		// TODO Auto-generated method stub
		
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