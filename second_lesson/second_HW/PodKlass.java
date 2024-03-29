// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PodKlass extends Klass {
    private String idPodKlass;
    private String namePodKlass;

    public PodKlass() {
        idPodKlass = "1.";
        namePodKlass = "Пустое имя";
    }

    public PodKlass(String idKlass, String nameKlass, String idPodKlass, String namePodKlass) {
        super(idKlass, nameKlass);
        this.idPodKlass = idPodKlass;
        this.namePodKlass = namePodKlass;
    }

    public PodKlass(String idKlass, String nameKlass, String idPodKlass) {
        super(idKlass, nameKlass);
        this.idPodKlass = idPodKlass;
    }
 
    public PodKlass(String idPodKlass, String namePodKlass) {
        this.idPodKlass = idPodKlass;
        this.namePodKlass = namePodKlass;
    }

    public PodKlass(String idPodKlass) {
        super(idPodKlass);
    }

    public String getIdPodKlass(){
    return idPodKlass;
    }
    public String getNamePodKlass() {
        return namePodKlass;
    }

    public void setNamePodKlass(String value) {
        this.namePodKlass = value;
    }

    public static Map<String, PodKlassT> convertListPodKlass(List<PodKlassT> list) {
        Map<String, PodKlassT> map = list.stream()
            .collect(Collectors.toMap(PodKlassT::getNamePodKlass, Function.identity()));
            return map;
    }
    public static ArrayList<PodKlassT> convertStringToPodKlass(List<String> lines) {
        ArrayList<PodKlassT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new PodKlassT(id, name));
        }
        return prods;
    }
    
    public static String FindNamePodKlass(ArrayList<PodKlassT> podKlasss, VidT findVid) {
        String findIdPodKlass = findVid.getIdVid();
        String newNamePodKlass = "";
        for (PodKlassT podKlass : podKlasss) {
            if (findIdPodKlass.contains(podKlass.getIdPodKlass()) == true) {
              newNamePodKlass = podKlass.getNamePodKlass();
            }
        }
        return "Подкласс - " + newNamePodKlass + ": ";
    }

    @Override
    public String toString() {
        // return String.format("%s, %d: %в - %s;", super.toString(), this.getIdKlass(), this.getMainNameKlass(), this.getNameKlass());
        return String.format("%s: Подкласс - %s;", this.getIdPodKlass(), this.getNamePodKlass());
    }
}