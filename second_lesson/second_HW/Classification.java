import java.util.ArrayList;

public class Classification {
    private ArrayList<Carstvo> carstvos = new ArrayList<>();
    private final static ArrayList<Carstvo> initCarstvos = new ArrayList<>();

    static {
        initCarstvos.add(new Carstvo("0", "0"));
    }

    public Classification() {
        this(initCarstvos);
    }

    public Classification(ArrayList<Carstvo> Carstvos) {
        this.carstvos = Carstvos;
    }

    public Classification(String idCarstvo, String nameCarstvo) {
        this.carstvos = new ArrayList<>();
        carstvos.add(new Carstvo(idCarstvo, nameCarstvo));
    }

    public Carstvo getNameCarstvo(String findNameCarstvo) {
        for (Carstvo carstvo : carstvos) {
            if (carstvo.getNameCarstvo().equals(findNameCarstvo)) {
                return carstvo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Carstvo carstvo : carstvos) {
            result = result + carstvo.toString() + "\n";
        }
        return result;
    }
}
