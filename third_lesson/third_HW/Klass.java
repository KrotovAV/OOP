// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class Klass extends Tip {
    private String id;
    private String name;

    public Klass() {
        id = "1.";
        name = "Пустое имя";
    }

    // public Klass(String idTip, String nameTip, String idKlass, String nameKlass) {
    //     super(idTip, nameTip);
    //     this.idKlass = idKlass;
    //     this.nameKlass = nameKlass;
    // }

    // public Klass(String idTip, String nameTip, String idKlass) {
    //     super(idTip, nameTip);
    //     this.idKlass = idKlass;
    // }
 
    public Klass(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Klass(String id) {
        this.id = id;
    }

    public String getId(){
    return id;
    }
    public String getName() {
        return name;
    }

    public void setNameKlass(String value) {
        this.name = value;
    }

    // public static Map<String, Klass> convertListKlass(List<Klass> list) {
    //     Map<String, Klass> map = list.stream()
    //         .collect(Collectors.toMap(Klass::getNameKlass, Function.identity()));
    //         return map;
    // }
    // public static ArrayList<Klass> convertStringToKlass(List<String> lines) {
    //     ArrayList<Klass> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new Klass(id, name));
    //     }
    //     return prods;
    // }
    // public static String FindNameKlass(ArrayList<Klass> klasss, Vid findVid) {
    //     String findIdKlass = findVid.getIdVid();
    //     String newNameKlass = "";
    //     for (Klass klass : klasss) {
    //         if (findIdKlass.contains(klass.getIdKlass()) == true) {
    //           newNameKlass = klass.getNameKlass();
    //         }
    //     }
    //     return "Класс - " + newNameKlass + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Класс - %s;", this.getId(), this.getName());
    }
}