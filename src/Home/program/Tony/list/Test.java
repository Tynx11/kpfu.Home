package Home.program.Tony.list;

/**
 * Created by Tony on 28.02.2017.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        List l = new ArrayList();
        for (int i = 0; i < 10 ; i++) {
            l.add (1 << i);

        }
        for (Object o : l) {
            System.out.println(o);
        }
        l.replaceAll(new UnaryOperator() {
            @Override
            public Object apply(Object o) {
                int a = ((int) o);

                return Math.sin(a);
            }

        });
        for (Object o : l) {
            System.out.println(o);

        }
        goo(new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return (int) o +
            }
        })


    }
    private static int goo(BiFunction biFunction){
        int a = 32;
        int b = 42;
        return (int) biFunction.apply(a, b);
    }


}
