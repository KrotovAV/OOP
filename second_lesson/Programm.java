package second_lesson.second_2_HW;

import java.util.ArrayList;

import second_lesson.ReadWhrite;

public class Programm {
    public static void main(String[] args) throws Exception {
        // ReadWhrite.nameX();
        String pathReadF = "D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/second_lesson/second_2_HW/base.txt";
        ArrayList<Product> prods = new ArrayList<>();
        prods = ReadWhrite.readFatnessFile(pathReadF);
        //-------------------------------------------------
    // ArrayList<Product> prods = new ArrayList<>();
    // Product prod1 = new Product("Snicers", 55);
    // prods.add(prod1);
    // prods.add(new Product("Mars", 50));
    // prods.add(new Product("Bownty", 60));
    // prods.add(new Product("Twix", 40));
    // prods.add(new Product("Lord", 65));
    // prods.add(new Product("Mix", 60));
    // prods.add(new Fatness("Hers", 50, 15));
    //------------------------------------------------
    // System.out.printf("%s, %d p\n", prod1.getName(), prod1.getCost());
    // System.out.println(prod1);
    // prod1.setCost(60);
    // // System.out.printf("%s, %d p\n", prod1.getName(), prod1.getCost());
    // System.out.println(prod1);
    VendingMasine v1 = new VendingMasine(prods);
    System.out.println(v1);

    // VendingMasine v2 = new VendingMasine();
    // System.out.println(v2);

    // String findName = "Ma";
    // System.out.println(v1.getProduct(findName));
    // System.out.println(v1.getProduct("Mars"));

    // int findName1 = 60;
    // System.out.println(v1.getProduct(findName1));
    // System.out.println(v1.getProduct(40));
    }
}
