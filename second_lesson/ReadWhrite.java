package second_lesson;

import java.io.*;
import java.util.ArrayList;
// import java.util.Scanner;

import second_lesson.second_2_HW.Product;

public class ReadWhrite {

    public static void nameX() {
        System.out.println("readWhrite OK");
    }

    public static String[] readFile(String pathReadF) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(pathReadF));
        String str;
        int i = 0;
        String[] readArr = new String[2];
        while ((str = br.readLine()) != null) {
            readArr[i] = str;
            i = i + 1;
        }
        br.close();
        return readArr;
    }

    public static ArrayList<Product> readFatnessFile(String pathReadF) throws Exception{
        ArrayList<Product> prods = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(pathReadF));
        String str, name;
        int cost;
        int fatness;
        while ((str = br.readLine()) != null) {
            // System.out.println(str);
            String[] words = str.split(",");
            // System.out.println(words[0]);
            // System.out.println(words[1]);
            name = words[0];
            cost = Integer.parseInt(words[1]);
            fatness = Integer.parseInt(words[2]);
            prods.add(new Fatness(name, cost, fatness));
            // prods.add(new Product(name, cost));
        }
        br.close();
        return prods;
    }

    // public static ArrayList<Product> readWorkerFile(String pathReadF) throws Exception, ClassNotFoundException{
    //     ArrayList<Product> prods = new ArrayList<>();
    //     try (String) {
    //         while (true) {
    //             Object read = objectInputStream.readObject();
    //             if (read == null)
    //                 break;
    //             Product prodsRead = (Product) read;
    //             prods.add(prodsRead);
    //             prods.add(new Product("Mars", 50));
    //         }
    //     }
    //     catch (EOFException e) {
    //     }
    //     return prods;
    // }

    public static void writeFile(double xF, String pathWriteF) {
        try (FileWriter fw = new FileWriter(pathWriteF, false)) {
            String resF = Double.toString (xF);
            fw.write(resF);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}