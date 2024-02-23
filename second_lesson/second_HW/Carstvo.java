// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Carstvo {
    private String idCarstvo;
    private String nameCarstvo;

    public Carstvo() {
        idCarstvo = "1.";
        nameCarstvo = "Пустое имя";
    }
    public Carstvo(String idCarstvo, String nameCarstvo) {
        this.idCarstvo = idCarstvo;
        this.nameCarstvo = nameCarstvo;
    }
    public Carstvo(String idCarstvo) {
        this.idCarstvo = idCarstvo;
    }

    public String getNameCarstvo() {
        return nameCarstvo;
    }
    public String getIdCarstvo() {
        return idCarstvo;
    }
    public void setNameCarstvo(String value) {
        this.nameCarstvo = value;
    }

    public static Map<String, CarstvoT> convertListCarstvo(List<CarstvoT> list) {
        Map<String, CarstvoT> map = list.stream()
            .collect(Collectors.toMap(CarstvoT::getNameCarstvo, Function.identity()));
            return map;
    }
    public static ArrayList<CarstvoT> convertStringToCarstvo(ArrayList<String> lines) {
        ArrayList<CarstvoT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new CarstvoT(id, name));
        }
        return prods;
    }

    public static String FindNameCarstvo(ArrayList<CarstvoT> carstvos, VidT findVid) {
        String findIdCarstvo = findVid.getIdVid();
        String newNameCarstvo = "";
        for (CarstvoT carstvo : carstvos) {
            if (findIdCarstvo.contains(carstvo.getIdCarstvo()) == true) {
                newNameCarstvo = carstvo.getNameCarstvo();
            }
        }
        return "Царство - " + newNameCarstvo + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s. Царство - %s;",this.getIdCarstvo(), this.getNameCarstvo());
    }
}

