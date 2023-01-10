// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class CarstvoT {//extends Metods {
    private String id;
    private String name;

    public CarstvoT() {
        id = "1.";
        name = "Пустое имя";
    }
    public CarstvoT(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public CarstvoT(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public void setName(String value) {
        this.name = value;
    }

    // public static Map<String, Carstvo> convertList(List<Carstvo> list) {
    //     Map<String, Carstvo> map = list.stream()
    //         .collect(Collectors.toMap(Carstvo::getName, Function.identity()));
    //         return map;
    // }
    // public static ArrayList<Carstvo> convertStringTo(ArrayList<String> lines) {
    //     ArrayList<Carstvo> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new Carstvo(id, name));
    //     }
    //     return prods;
    // }

    // public static String FindName(ArrayList<Carstvo> carstvos, Vid findVid) {
    //     String findid = findVid.getIdVid();
    //     String newname = "";
    //     for (Carstvo carstvo : carstvos) {
    //         if (findid.contains(carstvo.getId()) == true) {
    //             newname = carstvo.getName();
    //         }
    //     }
    //     return "Царство - " + newname + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s. Царство - %s;",this.getId(), this.getName());
    }
}

