import java.util.Date;
import java.text.*;
public class Date_time_and_format_in_java {
    public static void main(String[] gff)
    {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("month is " + (1+date.getMonth()) );
        System.out.println("Year is " + (1900+date.getYear()));
        System.out.println("day is " + date.getDay());
        System.out.println("hours is " + date.getHours());

        SimpleDateFormat sdf = new SimpleDateFormat("E  dd/MM/yyyy HH-mm-ss");
        System.out.println(sdf.format(date));
    }

}
