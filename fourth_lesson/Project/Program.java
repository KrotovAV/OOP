import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// import java.sql.Date;
// import java.util.Date;
// import java.text.SimpleDateFormat;

public class Program {
    
    void program() {
        // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
        // Date date = new Date(System.currentTimeMillis()); 
        // System.out.println(formatter.format(date));

        Chat gb = new Chat();
        User client1 = new User("Вася", gb);
        User client2 = new User("Маша", gb);
        User client4 = new User("Вальдемар", gb);

        gb.appendClient(client1);
        gb.appendClient(client2);
        gb.appendClient(client4);

        client1.sendMsg("привет всем!");

        client2.sendMsg("ку-ку!");

        User client3 = new User("Коля", gb);
        gb.appendClient(client3);

        client3.sendMsg("hello world!");
        client3.sendMsg("Котик", 3.3);
    }
}
