import java.util.Scanner;

/**
 * Created by Sergei on 03.11.2015.
 */
public class Nod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(nod(in.nextLong(), in.nextLong()));
    }

    static long nod(long a, long b) {
        if(a == 0) return b;
        if(b == 0) return a;

        if(a >= b) {
            long r = a % b;
            return nod(b, r);
        }

        if(b > a) {
            long r = b % a;
            return nod(a, r);
        }

        return a;
    }
}
