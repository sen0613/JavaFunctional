/**
 * Created by danawacomputer on 2017-04-19.
 */
public interface Interface101 {

    // 모든 변수는 public 이고 static, final 이다.
    // public static final
    int A_NUMBER = 5;

    // 모든 메소드는 public 이고 abstract 이다.
    // public abstract
    int max(int a, int b);

    // 자바8에서 새로운 메소드인 dafault메소드 등장
    default boolean isEven(int a) {
        return a % 2 == 0;
    }

    // 자바8에서는 static 메소드도 지원한다.
    public static int howManyChar(String s) {
        return s.length();
    }
}
