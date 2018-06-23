package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddTwoDateTime {

    public static void main(String[] args) {
        String s1 = "2018-01-01";
        String s2 = "2018-01-02";

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = sd.parse(s1);
            d2 = sd.parse(s2);
        } catch (ParseException e) {
        }

        long d1Milli = d1.getTime();
        long d2Milli = d2.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d1);
        calendar.get(Calendar.HOUR_OF_DAY);

        long total = d2Milli + d1Milli;
        Date dateTotal = new Date(total);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(dateTotal.toString());
    }
}
