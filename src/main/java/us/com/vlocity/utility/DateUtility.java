package us.com.vlocity.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateUtility {

  private static final String FORMATTER = "MM/dd/yyyy";

  public static String format(Date date) {
    SimpleDateFormat formatter = new SimpleDateFormat(FORMATTER);
    String strDate = formatter.format(date);
    return strDate;
  }


  public static String difference(String startDate, String finishDate) {
    SimpleDateFormat sdf = new SimpleDateFormat(FORMATTER, Locale.ENGLISH);
    Date firstDate;
    Date secondDate;
    try {
      firstDate = sdf.parse(startDate);
      secondDate = sdf.parse(finishDate);
      long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
      long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
      return diff + " days";
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }

}
