import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Пользователь
 */
class User {
    String name;
    private Chatroom chatroom;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
    Date date = new Date(System.currentTimeMillis()); 

    public User(String name, Chatroom chatroom, SimpleDateFormat formatter) {
        this.name = name;
        this.chatroom = chatroom;
        this.formatter = formatter;
        // formatter.format(date);
    }
    
    String strMessage(String msg) {
        return "Чат " + formatter.format(date)+ " " + name +":" + msg +" \n";
    }

    String strMessage(String msg, Double f) {
        return "Чат " + formatter.format(date) + " " + name + ":" +  msg + f;
    }

    void printMessage(String msg) {
        System.out.printf("Чат %s %s: %s\n", formatter.format(date), name, msg);
    }

    void printMessage(String msg, Double f) {
        System.out.printf("Чат %s: %s \n", name, msg, f);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }

    void sendMsg(String fileName, Double fileSize) {
        chatroom.sendMessage(fileName, fileSize, this);
    }
}