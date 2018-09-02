import java.util.HashMap;
import java.util.Map;

/**
 * FileName: java1408
 * Author:   Chris Li
 * Date:     8/30/2018 7:41 PM
 * Description: java1408
 * History:
 */

public class java1408 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Emp[] emp = new Emp[20];
        for (int i = 0; i < emp.length; i++) {
            emp[i].setId("i");
            emp[i].setValue("i");
        }
        for (int i = 0; i < emp.length; i++) {
            map.put(emp[i].id,emp[i].value);
        }
        map.remove("15");


    }
}
