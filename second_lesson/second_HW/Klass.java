// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Klass extends TipT {
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

    public static Map<String, KlassT> convertListKlass(List<KlassT> list) {
        Map<String, KlassT> map = list.stream()
            .collect(Collectors.toMap(KlassT::getNameKlass, Function.identity()));
            return map;
    }
    public static ArrayList<KlassT> convertStringToKlass(List<String> lines) {
        ArrayList<KlassT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new KlassT(id, name));
        }
        return prods;
    }
    public static String FindNameKlass(ArrayList<KlassT> klasss, VidT findVid) {
        String findIdKlass = findVid.getIdVid();
        String newNameKlass = "";
        for (KlassT klass : klasss) {
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