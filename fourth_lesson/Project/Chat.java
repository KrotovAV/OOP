import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Работа с чатом
 */
class Chat implements Chatroom {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); 
    Date date = new Date(System.currentTimeMillis()); 

    ArrayList<User> users = new ArrayList<>();
    public String text;
    /*
     * Отравка текстового сообщения
     */
    @Override
    public void sendMessage(String text, User me) {

        for (User user : users) {
            if (user.name != me.name) {
                System.out.println(formatter.format(date) + " ");
                user.printMessage(text);
                text = text + user.strMessage(text);
            }
        }
    }
    /*
     * Пользователь добавился
     */
    @Override
    public void appendClient(User client) {
        System.out.println("\n >>> " + formatter.format(date) + " добавился " + client.name);
        text = text + "\n >>>" + formatter.format(date) + " добавился " + client.name;
        users.add(client);
    }

    /*
     * Отправка файла
     */
    @Override
    public void sendMessage(String fileName, Double fileSize, User me) {
        System.out.println(
                me.name + " отправил файл с именем: " + fileName + " Раземер файла " + fileSize + " Мб");
        text = text + me.name + " отправил файл с именем: " + fileName + " Раземер файла " + fileSize + " Мб";
        for (User user : users) {
            if (user.name != me.name) {
                formatter.format(date);
                user.printMessage(fileName, fileSize);
                text = text + user.strMessage(fileName, fileSize);
            }
        }
    }
}
