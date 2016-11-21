import java.util.*;
import java.text.*;
public class Assignment24
{
    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

	public static void main(String[] args)
	{
	    try
	    {
		String sourceDate = "1992-04-04";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = format.parse(sourceDate);
		System.out.println("My birthday Date is :"+myDate.toString());
		myDate = Assignment24.addDays(myDate, 90);
		System.out.println("90 days after Date : "+myDate.toString());
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}
}