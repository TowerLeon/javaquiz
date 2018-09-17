/**
 * FileName: Java1708
 * Author:   Chris Li
 * Date:     9/17/2018 11:08 AM
 * Description:
 * History:
 */

public class Java1708<T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }


    public static void main(String[] args) {
        Java1708<String> t = new Java1708<>();
//        Java1708<String> t1 = new Java1708<>();
        String[] array = {"m1","m2","m3","m4","m5"};
        t.setArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(t.getArray()[i]);
        }

    }
}
