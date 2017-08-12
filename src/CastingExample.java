/**
 * @author bvanchuhov
 */
public class CastingExample {

    public static void main(String[] args) {
        int x = 10;
        long y = 3_000_000_000L;

        long z = x + y;
        System.out.println(z);

        int a = (int)z;
        System.out.println(a);
    }
}
