/**
 * FileName: Java1209
 * Author:   Lenovo
 * Date:     9/1/2018 11:50 PM
 * Description: Java1209
 * History:
 */

class Student {
    public static int speak(int m) throws MyException{
        if(m > 1000){
            throw new MyException("大于1000");
        }
        return m;
    }
}

public class Java1209 {
    public static void main(String[] args) {
        try{
            int result = Student.speak(1001);
            System.out.printf("The result is " + result);
        }
        catch (MyException e){
            System.out.println(e);
        }
    }
        }
