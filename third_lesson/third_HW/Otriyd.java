// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class Otriyd extends PodKlass {
    private String id;
    private String name;

    public Otriyd() {
        id = "1";
        name = "Пустое имя";
    }

    // public Otriyd(String idPodKlass, String namePodKlass, String idOtriyd, String nameOtriyd) {
    //     super(idPodKlass, namePodKlass);
    //     this.idOtriyd = idOtriyd;
    //     this.nameOtriyd = nameOtriyd;
    // }

    // public Otriyd(String idPodKlass, String namePodKlass, String idOtriyd) {
    //     super(idPodKlass, namePodKlass);
    //     this.idOtriyd = idOtriyd;
    // }
 
    public Otriyd(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Otriyd(String idOtriyd) {
        super(idOtriyd);
    }

    public String getIdOtriyd(){
    return id;
    }
    public String getNameOtriyd() {
        return name;
    }

    public void setNameOtriyd(String value) {
        this.name = value;
    }

    // public static Map<String, Otriyd> convertListOtriyd(List<Otriyd> list) {
    //     Map<String, Otriyd> map = list.stream()
    //         .collect(Collectors.toMap(Otriyd::getNameOtriyd, Function.identity()));
    //         return map;
    // }

    // public static ArrayList<Otriyd> convertStringToOtriyd(List<String> lines) {
    //     ArrayList<Otriyd> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new Otriyd(id, name));
    //     }
    //     return prods;
    // }

    // public static String FindNameOtriyd(ArrayList<Otriyd> otriyds, Vid findVid) {
    //     String findIdOtriyd = findVid.getIdVid();
    //     String newNameOtriyd = "";
    //     for (Otriyd otriyd : otriyds) {
    //         if (findIdOtriyd.contains(otriyd.getIdOtriyd()) == true) {
    //           newNameOtriyd = otriyd.getNameOtriyd();
    //         }
    //     }
    //     return "Отряд - " + newNameOtriyd + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Отряд - %s;", this.getId(), this.getName());
    }
}