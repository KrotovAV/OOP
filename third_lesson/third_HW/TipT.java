// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class TipT extends PodCarstvoT {
    private String id;
    private String name;

    public TipT() {
        id = "1.";
        name = "Пустое имя";
    }

    // public Tip(String idPodCarstvo, String namePodCarstvo, String id, String name) {
    //     // super(idCarstvo, nameCarstvo);
    //     super(idPodCarstvo, namePodCarstvo);
    //     this.id = id;
    //     this.name = name;
    // }

    // public Tip(String idPodCarstvo, String namePodCarstvo, String id) {
    //     super(idPodCarstvo, namePodCarstvo);
    //     this.id = id;
    // }
 
    public TipT(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public TipT(String id) {
        this.id = id;
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

    // public static Map<String, Tip> convertList(List<Tip> list) {
    //     Map<String, Tip> map = list.stream()
    //         .collect(Collectors.toMap(Tip::getName, Function.identity()));
    //         return map;
    // }

    // public static ArrayList<Tip> convertStringTo(List<String> lines) {
    //     ArrayList<Tip> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new Tip(id, name));
    //     }
    //     return prods;
    // }

    // public static String FindName(ArrayList<Tip> tips, Vid findVid) {
    //     String findid = findVid.getIdVid();
    //     String newname = "";
    //     for (Tip tip : tips) {
    //         if (findid.contains(tip.getid()) == true) {
    //           newname = tip.getname();
    //         }
    //     }
    //     return "Тип - " + newname + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Тип - %s;", this.getId(), this.getName());
    }
}

