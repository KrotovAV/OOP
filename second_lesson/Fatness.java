package second_lesson;

import second_lesson.second_2_HW.Product;

public class Fatness extends Product {
    private int fatness;

    public Fatness() {
    }

    public Fatness(String name, int cost, int fatness) {
        super(name, cost);
        this.fatness = fatness;
    }
    public Fatness(String name, int cost) {
        super(name, cost);
    }

    public Fatness(String name) {
        super(name);
    }
    
    public Integer getFatness(int findFatness) {
        return this.fatness;
    }
    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(), fatness);
    }
}
