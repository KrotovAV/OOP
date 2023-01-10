
import java.util.HashMap;
import java.util.Map;

public class PathT {
 
    public static String getPathName(String pathName) {
        Map<String, String> map = new HashMap<>();
        map.put("pathReadCarstvo", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Carstvo.txt");
        map.put("pathReadPodCarstvo", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/PodCarstvo.txt");
        map.put("pathReadTip", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Tip.txt");
        map.put("pathReadKlass", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Klass.txt");
        map.put("pathReadPodKlass", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/PodKlass.txt");
        map.put("pathReadOtriyd", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Otriyd.txt");
        map.put("pathReadSemeistvo","D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Semeistvo.txt");
        map.put("pathReadRod", "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Rod.txt");
        map.put("pathReadVid","D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/third_lesson/third_HW/Info/Vid.txt");
        
        return map.get(pathName);
    }


}
