
public class view {

    public static void printEmrty() {
        System.out.println();
    }

    public static void printString(String Text) {
        System.out.println(Text);
    }
    public static void mainMenu() {
        System.out.println("Maim menu:");
        System.out.println("----------- ------------ ----------- ------------ ------------ ------------");
        System.out.println("| s - show |  f - find  | с - change| d - delite |  a - add   | e - exit  |");
        System.out.println("----------- ------------ ----------- ------------ ------------ ------------");
    }

    public static String textReturn(String text){
        return text;
    // To find worker:\n - by fool name - 'n', - by birth date - 'bd', - by adres - 'a', - by job title - 'j', - by access level - 'al', -by work experience - 'we', - to exit - 'e'");
    }

    public static void printArrInt(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
    public static void printArrString(String[] arr) { 
        for (String item : arr) {
            System.out.print( item);
            System.out.println();
        }
        // System.out.println();
    }
}