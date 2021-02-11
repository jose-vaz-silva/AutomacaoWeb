package page;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class teste {

	@Test
	public void main() throws Exception {
		Long startTime = System.currentTimeMillis();
		
	TimeUnit.SECONDS.sleep(3);
		
		
		Long timeElapsed = System.currentTimeMillis() - startTime;
		
		Calendar cal =  new GregorianCalendar();
//		cal.set(Calendar.HOUR_OF_DAY, new Integer(Math.toIntExact(TimeUnit.HOURS.convert(timeElapsed, TimeUnit.MILLISECONDS))));
//		cal.set(Calendar.MINUTE, new Integer(Math.toIntExact(TimeUnit.MINUTES.convert(timeElapsed, TimeUnit.MILLISECONDS))));
//		cal.set(Calendar.SECOND, new Integer(Math.toIntExact(TimeUnit.SECONDS.convert(timeElapsed, TimeUnit.MILLISECONDS))));
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, new Integer(Math.toIntExact(TimeUnit.MILLISECONDS.convert(timeElapsed, TimeUnit.MILLISECONDS))));
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:sss");
		System.out.println(sdf.format(cal.getTime()));
	}

}
