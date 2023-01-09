// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Vid extends Rod {
    private String idVid;
    private String nameVid;

    public Vid() {
        idVid = "1.";
        nameVid = "Пустое имя";
    }

    public Vid(String idRod, String nameRod, String idVid, String nameVid) {
        super(idRod, nameRod);
        this.idVid = idVid;
        this.nameVid = nameVid;
    }

    public Vid(String idRod, String nameRod, String idVid) {
        super(idRod, nameRod);
        this.idVid = idVid;
    }
 
    public Vid(String idVid, String nameVid) {
        this.idVid = idVid;
        this.nameVid = nameVid;
    }

    public Vid(String nameVid) {
        this.nameVid = nameVid;
    }

    public String getIdVid(){
    return idVid;
    }

    public String getNameVid() {
        return nameVid;
    }

    public void setNameVid(String value) {
        this.nameVid = value;
    }

    public static Map<String, Vid> convertListVid(List<Vid> list) {
        Map<String, Vid> map = list.stream()
            .collect(Collectors.toMap(Vid::getNameVid, Function.identity()));
            return map;
    }
    public static ArrayList<Vid> convertStringToVid(List<String> lines) {
        ArrayList<Vid> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new Vid(id, name));
        }
        return prods;
    }

    public static String FindNameVid(ArrayList<Vid> vids, Vid findVid) {
        String findIdVid = findVid.getIdVid();
        String newNameVid = "";
        for (Vid vid : vids) {
            if (findIdVid.contains(vid.getIdVid()) == true) {
                newNameVid = vid.getNameVid();
            }
        }
        return "Вид - " + newNameVid + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Вид - %s;", this.getIdVid(), this.getNameVid());
    }
}