// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Semeistvo extends Otriyd {
    private String idSemeistvo;
    private String nameSemeistvo;

    public Semeistvo() {
        idSemeistvo = "1.";
        nameSemeistvo = "Пустое имя";
    }

    public Semeistvo(String idOtriyd, String nameOtriyd, String idSemeistvo, String nameSemeistvo) {
        super(idOtriyd, nameOtriyd);
        this.idSemeistvo = idSemeistvo;
        this.nameSemeistvo = nameSemeistvo;
    }

    public Semeistvo(String idOtriyd, String nameOtriyd, String idSemeistvo) {
        super(idOtriyd, nameOtriyd);
        this.idSemeistvo = idSemeistvo;
    }
 
    public Semeistvo(String idSemeistvo, String nameSemeistvo) {
        this.idSemeistvo = idSemeistvo;
        this.nameSemeistvo = nameSemeistvo;
    }

    public Semeistvo(String idSemeistvo) {
        super(idSemeistvo);
    }

    public String getIdSemeistvo(){
    return idSemeistvo;
    }
    public String getNameSemeistvo() {
        return nameSemeistvo;
    }

    public void setNameSemeistvo(String value) {
        this.nameSemeistvo = value;
    }
    public static Map<String, Semeistvo> convertListSemeistvo(List<Semeistvo> list) {
        Map<String, Semeistvo> map = list.stream()
            .collect(Collectors.toMap(Semeistvo::getNameSemeistvo, Function.identity()));
            return map;
    }
    public static ArrayList<Semeistvo> convertStringToSemeistvo(List<String> lines) {
        ArrayList<Semeistvo> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new Semeistvo(id, name));
        }
        return prods;
    }

    public static String FindNameSemeistvo(ArrayList<Semeistvo> semeistvos, Vid findVid) {
        String findIdSemeistvo = findVid.getIdVid();
        String newNameSemeistvo= "";
        for (Semeistvo semeistvo : semeistvos) {
            if (findIdSemeistvo.contains(semeistvo.getIdSemeistvo()) == true) {
                newNameSemeistvo = semeistvo.getNameSemeistvo();
            }
        }
        return "Семейство - " + newNameSemeistvo + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Семейсво - %s;", this.getIdSemeistvo(), this.getNameSemeistvo());
    }
}