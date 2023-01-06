
import java.util.HashMap;
import java.util.Map;

public class Path {
 
    public static String getPathName(String pathName) {
        Map<String, String> map = new HashMap<>();
        map.put("pathReadCarstvo", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Carstvo.txt");
        map.put("pathReadPodCarstvo", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/PodCarstvo.txt");
        map.put("pathReadTip", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Tip.txt");
        map.put("pathReadKlass", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Klass.txt");
        map.put("pathReadPodKlass", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/PodKlass.txt");
        map.put("pathReadOtriyd", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Otriyd.txt");
        map.put("pathReadSemeistvo","D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Semeistvo.txt");
        map.put("pathReadRod", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Rod.txt");
        map.put("pathReadVid","D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_HW/Info/Vid.txt");
        
        return map.get(pathName);
    }


}
