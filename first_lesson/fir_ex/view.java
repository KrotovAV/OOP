public class view {

    public static void printEmrty() {
        System.out.println();
    }

    public static void printString(String Text) {
        System.out.println(Text);
    }
    
    public static void printArr(int[] arrF) { 
        for (int item : arrF) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
}
