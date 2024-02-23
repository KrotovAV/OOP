import java.util.ArrayList;

public class Classification {
    private ArrayList<CarstvoT> carstvos = new ArrayList<>();
    private final static ArrayList<CarstvoT> initCarstvos = new ArrayList<>();

    static {
        initCarstvos.add(new CarstvoT("0", "0"));
    }

    public Classification() {
        this(initCarstvos);
    }

    public Classification(ArrayList<CarstvoT> Carstvos) {
        this.carstvos = Carstvos;
    }

    public Classification(String idCarstvo, String nameCarstvo) {
        this.carstvos = new ArrayList<>();
        carstvos.add(new CarstvoT(idCarstvo, nameCarstvo));
    }

    public CarstvoT getNameCarstvo(String findNameCarstvo) {
        for (CarstvoT carstvo : carstvos) {
            if (carstvo.getNameCarstvo().equals(findNameCarstvo)) {
                return carstvo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (CarstvoT carstvo : carstvos) {
            result = result + carstvo.toString() + "\n";
        }
        return result;
    }
}
