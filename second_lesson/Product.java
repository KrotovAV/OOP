package second_lesson.second_2_HW;

public class Product {
    private String name;
    private int cost;

    public Product() {
        name = "Пустое имя";
        cost = 0;
    }

    public Product(String name, int cost) {
        this(name);
        this.cost = cost;
    }
    public Product(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public void setName(String valueName) {
        this.name = valueName;
    }
    public void setCost(int value) {
        this.cost = value;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %d p", this.getName(), this.getCost());
    }

}
