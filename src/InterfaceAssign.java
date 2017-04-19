import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class InterfaceAssign {
//    public static void main(String[] args) {
//
//
//        List<String> list = Arrays.asList(
//                "100", "150", "200", "250", "300"
//                , "500", "1000", "5000", "10000"
//        );
//
//        Comparator c = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//                int a = Integer.parseInt(o1);
//                int b = Integer.parseInt(o2);
//
//                return a - b;
//            }
//        };
//
//        Collections.sort(list, c);
//        System.out.println(list);
//
//    }

    public static void main(String[] args) {


        List<String> list = Arrays.asList(
                "100", "150", "200", "250", "300"
                , "500", "1000", "5000", "10000"
        );


        Collections.sort(list,
                    (o1,o2) -> Integer.parseInt(o1)-Integer.parseInt(o2));

        System.out.println(list);

    }
}
