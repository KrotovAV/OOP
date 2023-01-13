import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Работа с чатом
 */
class Chat implements Chatroom {

    ArrayList<User> users = new ArrayList<>();
    public String text;
    SimpleDateFormat formatter;
    /*
     * Отравка текстового сообщения
     */
    @Override
    public void sendMessage(String text, User me) {

        for (User user : users) {
            if (user.name != me.name) {
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
        System.out.println("\n >>> " + formatter + "добавился " + client.name);
        text = text + "\n >>> добавился " + formatter + client.name;
        users.add(client);
    }

    /*
     * Отправка файла
     */
    @Override
    public void sendMessage(String fileName, Double fileSize, User me) {
        System.out.println(
                me.name + formatter + " отправил файл с именем: " + fileName + " Раземер файла " + fileSize + " Мб");
        text = text + me.name + " отправил файл с именем: " + fileName + " Раземер файла " + fileSize + " Мб";
        for (User user : users) {
            if (user.name != me.name) {
                user.printMessage(fileName, fileSize);
                text = text + user.strMessage(fileName, fileSize);
            }
        }
    }
}
