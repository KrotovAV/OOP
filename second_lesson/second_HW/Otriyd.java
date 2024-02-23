// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Otriyd extends PodKlassT {
    private String idOtriyd;
    private String nameOtriyd;

    public Otriyd() {
        idOtriyd = "1";
        nameOtriyd = "Пустое имя";
    }

    public Otriyd(String idPodKlass, String namePodKlass, String idOtriyd, String nameOtriyd) {
        super(idPodKlass, namePodKlass);
        this.idOtriyd = idOtriyd;
        this.nameOtriyd = nameOtriyd;
    }

    public Otriyd(String idPodKlass, String namePodKlass, String idOtriyd) {
        super(idPodKlass, namePodKlass);
        this.idOtriyd = idOtriyd;
    }
 
    public Otriyd(String idOtriyd, String nameOtriyd) {
        this.idOtriyd = idOtriyd;
        this.nameOtriyd = nameOtriyd;
    }

    public Otriyd(String idOtriyd) {
        super(idOtriyd);
    }

    public String getIdOtriyd(){
    return idOtriyd;
    }
    public String getNameOtriyd() {
        return nameOtriyd;
    }

    public void setNameOtriyd(String value) {
        this.nameOtriyd = value;
    }

    public static Map<String, OtriydT> convertListOtriyd(List<OtriydT> list) {
        Map<String, OtriydT> map = list.stream()
            .collect(Collectors.toMap(OtriydT::getNameOtriyd, Function.identity()));
            return map;
    }

    public static ArrayList<OtriydT> convertStringToOtriyd(List<String> lines) {
        ArrayList<OtriydT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new OtriydT(id, name));
        }
        return prods;
    }

    public static String FindNameOtriyd(ArrayList<OtriydT> otriyds, VidT findVid) {
        String findIdOtriyd = findVid.getIdVid();
        String newNameOtriyd = "";
        for (OtriydT otriyd : otriyds) {
            if (findIdOtriyd.contains(otriyd.getIdOtriyd()) == true) {
              newNameOtriyd = otriyd.getNameOtriyd();
            }
        }
        return "Отряд - " + newNameOtriyd + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Отряд - %s;", this.getIdOtriyd(), this.getNameOtriyd());
    }
}