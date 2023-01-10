import java.util.ArrayList;
import java.util.Arrays;

public class ViewT {
    // public class Car<T> {
//
//     private T t;

//     public void set(T t) { this.t = t; }
//     public T get() { return t; }
// }
    // private T t;
    // public void set(T t) { this.t = t; }
    // public T get() { return t; }
    
    public static void printEmrty() {
        System.out.println();
    }

    public static void printString(String text) {
        System.out.println(text);
    }

    public static void printClassification(ClassificationT classification) {
        System.out.println(classification);
    }
    
    // public static <T> void printMetodsT(ArrayList<T> t) {
    //     System.out.println(Arrays.deepToString(t.toArray()));
    // }
    public static <T> void printList(ArrayList<T> t){
        for(T elem : t){
            System.out.println(elem);
        }
    }
    // public static void printMetods(Metods3 metods) {
    //     System.out.println(metods);
    // }

    // public static void printMetods(Classification3 c1) {
    // }
}