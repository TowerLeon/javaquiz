import java.util.ArrayList;
import java.util.List;

public class java1406 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i +1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The original list is " +list.get(i));
        }
        list.remove(10);
        System.out.printf("The removed list");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("The changed list is " +list.get(i));
//        }
    }
}
