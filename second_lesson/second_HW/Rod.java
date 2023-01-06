// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rod extends Semeistvo {
    private String idRod;
    private String nameRod;

    public Rod() {
        idRod = "1.";
        nameRod = "Пустое имя";
    }

    public Rod(String idSemeistvo, String nameSemeistvo, String idRod, String nameRod) {
        super(idSemeistvo, nameSemeistvo);
        this.idRod = idRod;
        this.nameRod = nameRod;
    }

    public Rod(String idSemeistvo, String nameSemeistvo, String idRod) {
        super(idSemeistvo, nameSemeistvo);
        this.idRod = idRod;
    }
 
    public Rod(String idRod, String nameRod) {
        this.idRod = idRod;
        this.nameRod = nameRod;
    }

    public Rod(String idRod) {
        super(idRod);
    }

    public String getIdRod(){
    return idRod;
    }
    public String getNameRod() {
        return nameRod;
    }

    public void setNameRod(String value) {
        this.nameRod = value;
    }

    public static Map<String, Rod> convertListRod(List<Rod> list) {
        Map<String, Rod> map = list.stream()
            .collect(Collectors.toMap(Rod::getNameRod, Function.identity()));
            return map;
    }
    public static ArrayList<Rod> convertStringToRod(List<String> lines) {
        ArrayList<Rod> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new Rod(id, name));
        }
        return prods;
    }
    public static String FindNameRod(ArrayList<Rod> rods, Vid findRod) {
        String findIdRod = findRod.getIdVid();
        String newNameRod = "";
        for (Rod rod : rods) {
            if (findIdRod.contains(rod.getIdRod()) == true) {
                newNameRod = rod.getNameRod();
            }
        }
        return "Род - " + newNameRod + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Род - %s;", this.getIdRod(), this.getNameRod());
    }
}
 