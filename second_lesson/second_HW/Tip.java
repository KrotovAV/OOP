// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tip extends PodCarstvo {
    private String idTip;
    private String nameTip;

    public Tip() {
        idTip = "1.";
        nameTip = "Пустое имя";
    }

    public Tip(String idPodCarstvo, String namePodCarstvo, String idTip, String nameTip) {
        // super(idCarstvo, nameCarstvo);
        super(idPodCarstvo, namePodCarstvo);
        this.idTip = idTip;
        this.nameTip = nameTip;
    }

    public Tip(String idPodCarstvo, String namePodCarstvo, String idTip) {
        super(idPodCarstvo, namePodCarstvo);
        this.idTip = idTip;
    }
 
    public Tip(String idTip, String nameTip) {
        this.idTip = idTip;
        this.nameTip = nameTip;
    }

    public Tip(String idTip) {
        this.idTip = idTip;
    }

    public String getIdTip(){
    return idTip;
    }
    
    public String getNameTip() {
        return nameTip;
    }

    public void setNameTip(String value) {
        this.nameTip = value;
    }

    public static Map<String, TipT> convertListTip(List<TipT> list) {
        Map<String, TipT> map = list.stream()
            .collect(Collectors.toMap(TipT::getNameTip, Function.identity()));
            return map;
    }

    public static ArrayList<TipT> convertStringToTip(List<String> lines) {
        ArrayList<TipT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new TipT(id, name));
        }
        return prods;
    }

    public static String FindNameTip(ArrayList<TipT> tips, VidT findVid) {
        String findIdTip = findVid.getIdVid();
        String newNameTip = "";
        for (TipT tip : tips) {
            if (findIdTip.contains(tip.getIdTip()) == true) {
              newNameTip = tip.getNameTip();
            }
        }
        return "Тип - " + newNameTip + ": ";
    }

    @Override
    public String toString() {
        return String.format("%s: Тип - %s;", this.getIdTip(), this.getNameTip());
    }
}

