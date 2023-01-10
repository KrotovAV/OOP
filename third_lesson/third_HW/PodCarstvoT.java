// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

public class PodCarstvoT extends CarstvoT {
    private String id;
    private String name;

    public PodCarstvoT() {
        id = "1.";
        name = "Пустое имя";
    }

    // public PodCarstvo(String id, String name, String id, String name) {
    //     super(id, name);
    //     this.id = id;
    //     this.name = name;
    // }
    // public PodCarstvo(String id, String name, String id) {
    //     super(id, name;
    //     this.id = id;
    // }
    public PodCarstvoT(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public PodCarstvoT(String id) {
        super(id);
    }
    public String getId(){
    return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    // public static Map<String, PodCarstvo> convertListK(List<PodCarstvo> list) {
    //     Map<String, PodCarstvo> map = list.stream()
    //         .collect(Collectors.toMap(PodCarstvo::getname, Function.identity()));
    //         return map;
    // }
    // public static ArrayList<PodCarstvo> convertString(ArrayList<String> lines) {
    //     ArrayList<PodCarstvo> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new PodCarstvo(id, name));
    //     }
    //     return prods;
    // }
    // public static String Findname(ArrayList<PodCarstvo> podCarstvos, Vid findVid) {
    //     String findid = findVid.getIdVid();
    //     String newname = "";
    //     for (PodCarstvo podCarstvo : podCarstvos) {
    //         if (findid.contains(podCarstvo.getid()) == true) {
    //           newname = podCarstvo.getname();
    //         }
    //     }
    //     return "Подцарство - " + newname + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Подцарство - %s;", this.getId(), this.getName());
    }
}
