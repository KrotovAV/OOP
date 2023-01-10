// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RodT extends SemeistvoT {
    private String id;
    private String name;

    public RodT() {
        id = "1.";
        name = "Пустое имя";
    }

    // public RodT(String idSemeistvo, String nameSemeistvo, String id, String name) {
    //     super(idSemeistvo, nameSemeistvo);
    //     this.id = id;
    //     this.name = name;
    // }

    // public RodT(String idSemeistvo, String nameSemeistvo, String id) {
    //     super(idSemeistvo, nameSemeistvo);
    //     this.id = id;
    // }
 
    public RodT(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public RodT(String id) {
        super(id);
    }

    public String getId(){
    return id;
    }
    public String getName() {
        return name;
    }

    public void setname(String value) {
        this.name = value;
    }

    // public static Map<String, RodT> convertListRod(List<RodT> list) {
    //     Map<String, RodT> map = list.stream()
    //         .collect(Collectors.toMap(RodT::getname, Function.identity()));
    //         return map;
    // }
    // public static ArrayList<RodT> convertStringToRod(List<String> lines) {
    //     ArrayList<RodT> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new RodT(id, name));
    //     }
    //     return prods;
    // }
    // public static String Findname(ArrayList<RodT> rods, VidT findRod) {
    //     String findid = findRod.getId();
    //     String newname = "";
    //     for (RodT rod : rods) {
    //         if (findid.contains(rod.getId()) == true) {
    //             newname = rod.getName();
    //         }
    //     }
    //     return "Род - " + newname + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Род - %s;", this.getId(), this.getName());
    }
}
 