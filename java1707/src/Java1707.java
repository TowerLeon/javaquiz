/**
 * FileName: Java1707
 * Author:   Chris Li
 * Date:     9/17/2018 9:36 AM
 * Description:
 * History:
 */

public class Java1707 {
    Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        Java1707 j = new Java1707();
        j.setO(new Boolean(true));
        System.out.println(j.getO());
        j.setO(new Float(12.3));
//        Float f = (Float) j.getO(); //correct
        Integer f = (Integer) j.getO(); //error
        System.out.println(f);

    }
}
