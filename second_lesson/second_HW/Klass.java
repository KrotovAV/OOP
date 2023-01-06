// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Klass extends Tip {
    private String idKlass;
    private String nameKlass;

    public Klass() {
        idKlass = "1.";
        nameKlass = "Пустое имя";
    }

    public Klass(String idTip, String nameTip, String idKlass, String nameKlass) {
        super(idTip, nameTip);
        this.idKlass = idKlass;
        this.nameKlass = nameKlass;
    }

    public Klass(String idTip, String nameTip, String idKlass) {
        super(idTip, nameTip);
        this.idKlass = idKlass;
    }
 
    public Klass(String idKlass, String nameKlass) {
        this.idKlass = idKlass;
        this.nameKlass = nameKlass;
    }

    public Klass(String idKlass) {
        this.idKlass = idKlass;
    }

    public String getIdKlass(){
    return idKlass;
    }
    public String getNameKlass() {
        return nameKlass;
    }

    public void setNameKlass(String value) {
        this.nameKlass = value;
    }

    public static Map<String, Klass> convertListKlass(List<Klass> list) {
        Map<String, Klass> map = list.stream()
            .collect(Collectors.toMap(Klass::getNameKlass, Function.identity()));
            return map;
    }
    public static ArrayList<Klass> convertStringToKlass(List<String> lines) {
        ArrayList<Klass> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new Klass(id, name));
        }
        return prods;
    }
    public static String FindNameKlass(ArrayList<Klass> klasss, Vid findVid) {
        String findIdKlass = findVid.getIdVid();
        String newNameKlass = "";
        for (Klass klass : klasss) {
            if (findIdKlass.contains(klass.getIdKlass()) == true) {
              newNameKlass = klass.getNameKlass();
            }
        }
        return "Класс - " + newNameKlass + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Класс - %s;", this.getIdKlass(), this.getNameKlass());
    }
}