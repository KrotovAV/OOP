import java.util.Arrays;
import java.util.List;

public class Company {

    public List<Workers> lists;

    public Company(List<Workers> lists) {
        this.lists = lists;
    }

    public void printWorkers() {
        for(Workers worker: lists) {
            System.out.println(worker.toString());
        }
    }
    
}
