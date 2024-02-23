import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

public class PodCarstvo extends Carstvo {
    private String idPodCarstvo;
    private String namePodCarstvo;

    public PodCarstvo() {
        idPodCarstvo = "1.";
        namePodCarstvo = "Пустое имя";
    }

    public PodCarstvo(String idCarstvo, String nameCarstvo, String idPodCarstvo, String namePodCarstvo) {
        super(idCarstvo, nameCarstvo);
        this.idPodCarstvo = idPodCarstvo;
        this.namePodCarstvo = namePodCarstvo;
    }
    public PodCarstvo(String idCarstvo, String nameCarstvo, String idPodCarstvo) {
        super(idCarstvo, nameCarstvo);
        this.idPodCarstvo = idPodCarstvo;
    }
    public PodCarstvo(String idPodCarstvo, String namePodCarstvo) {
        this.idPodCarstvo = idPodCarstvo;
        this.namePodCarstvo = namePodCarstvo;
    }
    public PodCarstvo(String idPodCarstvo) {
        super(idPodCarstvo);
    }
    public String getIdPodCarstvo(){
    return idPodCarstvo;
    }
    public String getNamePodCarstvo() {
        return namePodCarstvo;
    }

    public void setNamePodCarstvo(String value) {
        this.namePodCarstvo = value;
    }

    public static Map<String, PodCarstvoT> convertListPodCarstvo(List<PodCarstvoT> list) {
        Map<String, PodCarstvoT> map = list.stream()
            .collect(Collectors.toMap(PodCarstvoT::getNamePodCarstvo, Function.identity()));
            return map;
    }
    public static ArrayList<PodCarstvoT> convertStringToPodCarstvo(ArrayList<String> lines) {
        ArrayList<PodCarstvoT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new PodCarstvoT(id, name));
        }
        return prods;
    }
    public static String FindNamePodCarstvo(ArrayList<PodCarstvoT> podCarstvos, VidT findVid) {
        String findIdPodCarstvo = findVid.getIdVid();
        String newNamePodCarstvo = "";
        for (PodCarstvoT podCarstvo : podCarstvos) {
            if (findIdPodCarstvo.contains(podCarstvo.getIdPodCarstvo()) == true) {
              newNamePodCarstvo = podCarstvo.getNamePodCarstvo();
            }
        }
        return "Подцарство - " + newNamePodCarstvo + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Подцарство - %s;", this.getIdPodCarstvo(), this.getNamePodCarstvo());
    }
}
