/**
 * FileName: Java1708Revised
 * Author:   Chris Li
 * Date:     9/17/2018 10:20 AM
 * Description:
 * History:
 */

public class Java1708Revised<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
    Java1708Revised<Boolean> t1 = new Java1708Revised<Boolean>();
    Java1708Revised<Float> t2 = new Java1708Revised<Float>();
    t1.setT(new Boolean(true));
    System.out.println(t1.getT());
    t2.setT(new Float(12.3));
    Float f = (Float) t2.getT();  //correct
//    Float f = (Integer) t2.getT(); //wrong
    System.out.println(f);
    }
}
