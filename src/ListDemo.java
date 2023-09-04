import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        List L = new ArrayList();
        L.add("a");
        L.add("b");
        L.add("c");
        System.out.println(L);
        System.out.println("---------------------------");

        String[] x = new String[5]; // size 5
        x[0] = "a";
        x[1] = "b";
        System.out.println(x[0]);
    }
}
