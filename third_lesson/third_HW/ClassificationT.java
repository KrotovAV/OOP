import java.util.ArrayList;

public class ClassificationT <T>{
    private ArrayList<T> carstvos = new ArrayList<>();
    private ArrayList<T> initCarstvos = new ArrayList<>();

    // static {
    //     initCarstvos.add(new CarstvoT("0", "0"));
    // }

    public ClassificationT() {
        this(initCarstvos);
    }

    public ClassificationT(ArrayList<T> Carstvos) {
        this.carstvos = Carstvos;
    }

    // public ClassificationT(String id, String name) {
    //     this.carstvos = new ArrayList<>();
    //     carstvos.add(new T(id, name));
    // }

    public T getName(String name) {
        for (T carstvo : carstvos) {
            if (carstvo.getName().equals(name)) {
                return carstvo;
            }
        }
        return null;
    }

    // public static <T> void printMetods(ArrayList<T> t) {
    //     System.out.println(t);
    // }

    @Override
    public String toString() {
        String result = "";
        for (T carstvo : carstvos) {
            result = result + carstvo.toString() + "\n";
        }
        return result;
    }
}
