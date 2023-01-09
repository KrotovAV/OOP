import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Metods {
    // private String id;
    // private String name;

    // public Metods() {
    //     id = "1.";
    //     name = "Пустое имя";
    // }

    // public Metods(String id, String name) {
    //     this.id = id;
    //     this.name = name;
    // }

    // public String getId() {
    // return id;
    // }
    // public String getName() {
    //     return name;
    // }

    // public void setName(String value) {
    //     this.name = value;
    // }


    //----------------------------------------
    public static <T> boolean find(Classification c, String Name, ArrayList<T> tList) {
        boolean checkF = true;
        InputScaner inS1 = new InputScaner();
        View.printClassification(c);
        String cfName = inS1.inputString(Menu.getMenuName("Name"));
        Map<String, T> mapT = new HashMap<>();
        mapT = convertList(tList);
        if (cfName.equals("e")) {
            checkF = false;
        }
        else {
            T t = map.get(cfName);
            if (t == null) { 
                View.printString(Menu.getMenuName("NF"));
            }
            else {
                Vid vid = new Vid(((Tip) t).getId(), ((Tip) t).getName());
                View.printString(((T) t).FindName(tList, vid));
            }
        }
        return checkF;
    }
    public static <T> String FindName(ArrayList<T> ts, Vid findVid) {
        String findId = findVid.getIdVid();
        String newname = "";
        for (T t : ts) {
            if (findId.contains(((T) t).getId()) == true) {
              newname = ((T) t).getName();
            }
        }
        T t = new (T)<T>();
        String ret;
        // String className = (T).(T) t.getSimpleName();
        String className = t.getCanonicalName();
        if (className.contains("Carstvo") == true) ret = "Царство";
        // if (className == "Carstvo") ret = "Царство";
        return "Подцарство - " + newname + ": ";
    }
    public static <T> Map<String, T> convertList(List<T> list) {
        Map<String, Tip> mapT = list.stream()
            .collect(Collectors.toMap(Tip::getName, Function.identity()));
            return mapT;
    }
    public static <T> ArrayList<T> convertString(ArrayList<String> lines, T t) throws Exception {
        ArrayList<T> prods = new ArrayList<>();
        String id, name;
        for (String line : lines) {
            String[] words = line.split(",");
            id = words[0];
            name = words[1];
            // genericMethod(Supplier T prods);
            t = T (id, name);
            // prods.add(t);
            // MyGeneric<T> t = new MyGeneric<T>(T.class);

            // Bar bar = mg.getTObject();
            prods.add(new T (id, name));
            
            // T newT = new T();
            // T newT = extracted(); 
            // T newT = lines.newInstance(id, name);
            // newT = T(id, name);
            // genericMethod(String::new);
            // prods.add(newT);
        }
        return prods;
    }
    
    // public <T> void genericMethod(Supplier<T> cons) {
    //     T t = cons.get();
    // }

    public class MyGeneric<T> {

        private T tobject;
     
        public MyGeneric(Class<T> tclass)
                throws InstantiationException, IllegalAccessException {
            
            this.tobject = (T) tclass.newInstance();
            
        }
    
        public T getTObject() {
            return this.tobject;
        }
    }
}