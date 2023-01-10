import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;


// public class MetodsT <T> {
public class MetodsT <T> extends VidT {
    String id;
    String name;

    private ArrayList<T> ts = new ArrayList<T>();
    // private final static ArrayList<T> initTs = new ArrayList<>();

    public MetodsT(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    // static T Create(T t)
    //     {
    //         return (T)Activator.CreateInstance(t);
    //     }
    // public <T> T metods(Class<T> tClass) throws InstantiationException , IllegalAccessException{
    //     T instance = tClass.newInstance();
    //     return instance;
    // }
     //----------------------------------------
    // public static <T> boolean find(ClassificationT c, String Name, ArrayList<T> tList) {
    //     boolean checkF = true;
    //     InputScanerT inS1 = new InputScanerT();
    //     ViewT.printClassification(c);
    //     String cfName = inS1.inputString(MenuT.getMenuName("Name"));
    //     Map<String, T> mapT = new HashMap<>();
    //     mapT = convertList(tList);
    //     if (cfName.equals("e")) {
    //         checkF = false;
    //     }
    //     else {
    //         T t = mapT.get(cfName);
    //         if (t == null) { 
    //             ViewT.printString(MenuT.getMenuName("NF"));
    //         }
    //         else {
    //             VidT vid = new VidT(((TipT) t).getId(), ((TipT) t).getName());
    //             ViewT.printString(((MetodsT) t).FindName(tList, vid));
    //         }
    //     }
    //     return checkF;
    // }
    //------------------------------------------------------------------------
    // public static <T> String FindName(ArrayList<T> ts, VidT findVid) {
    //     String findId = findVid.getId();
    //     String newname = "";
    //     for (T t : ts) {
    //         if (findId.contains(((T) t).getId()) == true) {
    //           newname = ((T) t).getName();
    //         }
    //     }
    //     T t = new (T)<T>();
    //     // String ret;
    //     // String className = (T).(T) t.getSimpleName();
    //     // String className = t.getCanonicalName();
    //     // if (className.contains("Carstvo") == true) ret = "Царство";
    //     // if (className == "Carstvo") ret = "Царство";
    //     return "Подцарство - " + newname + ": ";
    // }
    //---------------------------------------------------------------------
    // public static <T> Map<String, T> convertList(List<T> list) {
    //     Map<String, T> mapT = list.stream()
    //         .collect(Collectors.toMap(T::getName, Function.identity()));
    //         return mapT;
    // }
    //----------------------------------------------------------------------------------------
    // public static <T> Map< String, T > convertList(List<T> list) {
    //     // Map<String, T> mapT = list.stream()
    //     // .collect(Collectors.toMap(list -> list.getName() + "||" + list.getId(), x -> x));
    //     // return mapT;
    //     Map<String, T> mapT = list.stream()
    //      .collect(Collectors.toMap(b -> b.getName() + "||" + b.getId(), Function.identity()));
    //     return mapT;
    // }

    // public static  ArrayList<CarstvoT> convertString(ArrayList<String> lines) throws Exception {
    //     ArrayList<CarstvoT> prods = new ArrayList<>();
    //     String id, name;
    //     for (String line : lines) {
    //         String[] words = line.split(",");
    //         id = words[0];
    //         name = words[1];
    //         prods.add(new CarstvoT(id, name));
    //     }
    //     return prods;
    // }

    public static ArrayList<CarstvoT> convertString(ArrayList<String> lines) throws Exception {
        ArrayList<CarstvoT> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            prods.add(new CarstvoT(id, name));
            // prods.add(new super(id, name));
        }
        return prods;
    }

    // private ArrayList<T> ts = new ArrayList<>();
    // private final static ArrayList<T> initTs = new ArrayList<>();

    // static {
    //     initTs.add(new Metods3<>("0", "0"));
    // }

    // public Metods3() {
    //     this(ts);
    // }

    // public Metods3(ArrayList<T> Ts) { 
    //     this.ts = ts;
    // }

    // public Metods3(String id, String name) {
    //     this.ts = new ArrayList<>();
    //     ts.add(new Metods3<>(id, name));
    // }

    // public T getName(String findName) {
    //     for (T t : ts) {
    //         if (t.getName().equals(findName)) {
    //             return t;
    //         }
    //     }
    //     return null;
    // }


    // public static <T> void printMetods(ArrayList<T> t) {
    //     System.out.println(t);
    // }


    @Override
    public String toString() {
        String result = "";
        for (T t : ts) {
            result = result + t.toString() + "\n";
        }
        return result;
    }

}