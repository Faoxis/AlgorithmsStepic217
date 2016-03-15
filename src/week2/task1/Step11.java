import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sergei on 19.11.2015.
 */
public class Step11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        ArrayList<Integer> sum = new ArrayList<Integer>();
        int s = 0;
        int s_next = 0;

        for(int i = 1; s != n; ++i) {
            s = s + i;

            if(s == n) {
                sum.add(i);
                break;
            }

            s_next = s + i + 1;

            if (s_next > n) {
                s = s - i;
            } else {
                sum.add(i);

                if(s_next == n) {
                    sum.add(i + 1);
                    break;
                }
            }


        }

        System.out.println(sum.size());
        System.out.print(sum.get(0));
        for(int i = 1; i < sum.size(); ++i) {
            System.out.print(" " + sum.get(i));
        }

        //    for(int i = 0; i < numb.size(); ++i) {
        //        System.out.print(numb.get(i) + " ");
        //    }

    }
}
