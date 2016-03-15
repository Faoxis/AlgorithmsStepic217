package week1;

/**
 * Created by Sergei on 15.03.2016.
 *
 */
/**
 * Created by Sergei on 02.11.2015.
 */

import java.io.IOException;
import java.util.*;

public class Fibonacci3 {
    static public void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long m = (int) in.nextInt();

        long a = 0;
        long b = 1;
        long c = 0;

        long k = pi(m);

        long numb = n % k;

        for(long i = 0; i < numb - 1; ++i) {
            a = (b + c) % m;
            c = b;
            b = a;
        }


        System.out.println(a);

    }

    static public int pi(long residue) {
        int count = 1;

        long a,b,c;
        b = 0;
        c = 1;

        for(int i = 0; i < ((residue * residue) + 1); ++i) {
            a = (b + c) % residue;
            c = b;
            b = a;

            if((a == 0) && ((b + c) % residue) == 1) {
                return count;
            }

            count++;
        }


        return count;
    }
}
