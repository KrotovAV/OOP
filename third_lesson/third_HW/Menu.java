import java.util.HashMap;
import java.util.Map;

public class Menu {
// Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid
    public static String getMenuName(String menuName) {
        Map<String, String> map = new HashMap<>();
        
        map.put("MaimMenu", "| s - show |  f - find  | с - change| d - delite |  a - add   | e - exit  |");
        map.put("Select", "Select a command and write the letter: ");
        map.put("Menu", "| c - carstvo| pc - podcarstvo| t - tip| k - klass| pk - podKlass| o - otriyd| s - semeistvo| r -rod| v -vide| e - exit|");
        map.put("Show", "To show:\n" + map.get("Menu"));
        map.put("Find", "To find:\n" + map.get("Menu"));
        map.put("Change", "To Change:\n" + map.get("Menu"));
        map.put("Delite", "To delite:\n" + map.get("Menu"));
        map.put("Add", "To add:\n" + map.get("Menu"));

        map.put("Wrong", "Wrong command!");

        map.put( "CarstvoName", "Whrite Carstvo name to find | e - exit |");
        map.put( "PodCarstvoName", "Whrite PodCarstvo name to find | e - exit |");
        map.put( "TipName", "Whrite Tip name to find | e - exit |");
        map.put( "KlassName", "Whrite Klass name to find | e - exit |");
        map.put( "PodKlassName", "Whrite PodKlass name to find | e - exit |");
        map.put( "OriydName", "Whrite Oriyd name to find | e - exit |");
        map.put( "SemeistvoName", "Whrite Semeistvo name to find | e - exit |");
        map.put( "RodName", "Whrite Rod name to find | e - exit |");
        map.put( "VidName", "Whrite Vid name to find | e - exit |");
        map.put( "NF", "Not find");

        map.put( "ChangeMenu", "Change | i - id | n - name| e - exit| se - save & exit");
        map.put( "AddMenu", "Add | a - add id & name| e - exit|");
        map.put( "DeliteMenu", "Delite | d - Delite id & name| e - exit|");
        map.put( "AddMenuSE", "Save | e - exit| se - save & exit");
        map.put( "DeliteMenuDE", "Delite | e - exit| de - delite & exit");
        map.put( "Id", "Whrite new id");
        map.put( "Name", "Whrite new name");

        return map.get(menuName);
    }
}

