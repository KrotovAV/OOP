// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SemeistvoT extends OtriydT {
    private String id;
    private String name;

    public SemeistvoT() {
        id = "1.";
        name = "Пустое имя";
    }

    // public SemeistvoT(String idOtriyd, String nameOtriyd, String id, String name) {
    //     super(idOtriyd, nameOtriyd);
    //     this.id = id;
    //     this.name = name;
    // }

    // public SemeistvoT(String idOtriyd, String nameOtriyd, String id) {
    //     super(idOtriyd, nameOtriyd);
    //     this.id = id;
    // }
 
    public SemeistvoT(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SemeistvoT(String id) {
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
    // public static Map<String, SemeistvoT> convertListSemeistvo(List<SemeistvoT> list) {
    //     Map<String, SemeistvoT> map = list.stream()
    //         .collect(Collectors.toMap(SemeistvoT::getName, Function.identity()));
    //         return map;
    // }
    // public static ArrayList<SemeistvoT> convertStringToSemeistvo(List<String> lines) {
    //     ArrayList<SemeistvoT> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new SemeistvoT(id, name));
    //     }
    //     return prods;
    // }

    // public static String Findname(ArrayList<SemeistvoT> semeistvos, VidT findVid) {
    //     String findid = findVid.getId();
    //     String newname= "";
    //     for (SemeistvoT semeistvo : semeistvos) {
    //         if (findid.contains(semeistvo.getId()) == true) {
    //             newname = semeistvo.getName();
    //         }
    //     }
    //     return "Семейство - " + newname + ": ";
    // }

    @Override
    public String toString() {
        return String.format("%s: Семейсво - %s;", this.getId(), this.getName());
    }
}