import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write text ");
        String word = sc.nextLine();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            System.out.println(" * " + word.charAt(i) + " * ");
        }
        System.out.println();
    }
}