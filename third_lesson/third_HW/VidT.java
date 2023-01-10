// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VidT extends RodT {
    private String id;
    private String name;

    public VidT() {
        id = "1.";
        name = "Пустое имя";
    }

    // public VidT(String idRod, String nameRod, String idVid, String nameVid) {
    //     super(idRod, nameRod);
    //     this.idVid = idVid;
    //     this.nameVid = nameVid;
    // }

    // public VidT(String idRod, String nameRod, String idVid) {
    //     super(idRod, nameRod);
    //     this.idVid = idVid;
    // }
 
    public VidT(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public VidT(String name) {
        this.name = name;
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

    // public static Map<String, VidT> convertListVid(List<VidT> list) {
    //     Map<String, VidT> map = list.stream()
    //         .collect(Collectors.toMap(VidT::getNameVid, Function.identity()));
    //         return map;
    // // }
    // public static ArrayList<VidT> convertStringToVid(List<String> lines) {
    //     ArrayList<VidT> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new VidT(id, name));
    //     }
    //     return prods;
    // }

    // public static String FindNameVid(ArrayList<VidT> vids, VidT findVid) {
    //     String findIdVid = findVid.getIdVid();
    //     String newNameVid = "";
    //     for (VidT vid : vids) {
    //         if (findIdVid.contains(vid.getIdVid()) == true) {
    //             newNameVid = vid.getNameVid();
    //         }
    //     }
    //     return "Вид - " + newNameVid + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Вид - %s;", this.getId(), this.getName());
    }
}