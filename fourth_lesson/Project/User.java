import java.text.SimpleDateFormat;
import java.util.Date;

// Date date = new Date();
/**
 * Пользователь
 */
class User {
    // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
    // Date date = new Date(System.currentTimeMillis()); 
    // System.out.println(formatter.format(date));

    String name;
    private Chatroom chatroom;
    // Date date
    // formatter.format(date);
    SimpleDateFormat formatter;
    // private String formatter.format(date);

    public User(String name, Chatroom chatroom, SimpleDateFormat formatter) {
        this.name = name;
        this.chatroom = chatroom;
        this.formatter = formatter;
    }
    public User(String name, Chatroom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    String strMessage(String msg) {
        return "Чат " + formatter + name +":" + msg +" \n";
    }
    String strMessage(String msg, Double f) {
        return "Чат " + formatter +  name + ":" +  msg + f;
    }
    void printMessage(String msg) {
        System.out.printf("Чат %s %s: %s\n", formatter, name, msg);
    }

    void printMessage(String msg, Double f) {
        System.out.printf("Чат %s %s: %s \n", formatter, name, msg, f);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }

    void sendMsg(String fileName, Double fileSize) {
        chatroom.sendMessage(fileName, fileSize, this);
    }
}