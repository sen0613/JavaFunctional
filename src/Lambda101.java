/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Lambda101 {
    public static void main(String[] args) {

//               (a, b) -> a > b ? a : b;
//
//
//        a -> a % 2 == 0;
//
//        String s -> s.length();
        int i = Interface101.howManyChar("Hello world");
        System.out.println(i);
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }


    boolean isEven(int a) {
        return a % 2 == 0;
    }

    int HowManyChar(String s){
        return s.length();
    }
}
