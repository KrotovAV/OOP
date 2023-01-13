import java.sql.Date;
import java.text.SimpleDateFormat;

public class Time {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
    Date date = new Date(System.currentTimeMillis()); 
    // System.out.println(formatter.format(date));
    Time(SimpleDateFormat formatter, Date date){
        System.out.println(formatter.format(date));
    }
}
