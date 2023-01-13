import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    
    void program() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
        Date date = new Date(System.currentTimeMillis()); 

        Chat gb = new Chat();
        User client1 = new User("Вася", gb, formatter);
        User client2 = new User("Маша", gb, formatter);
        User client4 = new User("Вальдемар", gb, formatter);

        gb.appendClient(client1);
        gb.appendClient(client2);
        gb.appendClient(client4);

        client1.sendMsg("привет всем!");

        client2.sendMsg("ку-ку!");

        User client3 = new User("Коля", gb, formatter);
        gb.appendClient(client3);

        client3.sendMsg("hello world!");
        client3.sendMsg("Котик", 3.3);
    }
}
