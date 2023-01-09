package third_lesson.test;

import java.util.Arrays;
import java.util.List;

public class Prog {
    public static void main(String []args) {
		List list = Arrays.asList("Author", "Book");
		for (Object element : list) {
		    String data = Util.getValue(element, String.class);
		    System.out.println(data);
		    System.out.println(Util.<String>getValue(element));
		}
    }
}
