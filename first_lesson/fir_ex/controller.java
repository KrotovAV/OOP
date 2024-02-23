import Project.inputScaner;
import Project.modell;

public class controller {

    public static void run() {

        System.out.println("xxxx ss");
        inputScaner nInt = new inputScaner();
        int n = nInt.inputInt("Whrite array size: ");

        inputScaner frInt = new inputScaner();
        int fr = frInt.inputInt("Whrite min namber random ");

        inputScaner toInt = new inputScaner();
        int to = toInt.inputInt("Whrite min namber random ");

        int[] arr = modell.createArr(n);
        arr = modell.fillRandomArr(arr, n, fr, to);
        View.printEmrty();
        View.printString("Array: ");
        View.printArr(arr);

        int[] newArr = modell.createArr(n-2);
        newArr = modell.sum3Elenent(arr, n);
        View.printEmrty();
        View.printString("New array: ");
        View.printArr(newArr);
        View.printEmrty();
    }
}
