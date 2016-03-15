import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sergei on 18.11.2015.
 */
public class Step9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> start = new ArrayList<Integer>();
        ArrayList<Integer> end   = new ArrayList<Integer>();
        ArrayList<Integer> dots  = new ArrayList<Integer>();

        for(int i = 0; i < n; ++i) {
            start.add(in.nextInt());
            end.add(in.nextInt());
        }

        int min_end = end.get(0);
        int min_ind = 0;

        int counter = end.size();

        while(counter > 0) {
            min_end = end.get(0);
            min_ind = 0;
            for(int i = 0; i < end.size(); ++i) {
                if(min_end > end.get(i)) {
                    min_ind = i;
                    min_end = end.get(i);
                }
            }

            dots.add(min_end);

            for(int i = 0; i < end.size(); ++i) {
                if( end.get(min_ind) >= start.get(i) && min_ind != i ) {
                    if(i < min_ind) {
                        min_ind--;
                    }

                    end.remove(i);
                    start.remove(i);
                    counter--;

                    i--;
                }
            }

            end.remove(min_ind);
            start.remove(min_ind);
            counter--;


        }

        System.out.println(dots.size());
        for(int i = 0; i < dots.size(); ++i) {
            System.out.print(dots.get(i) + " ");
        }

    }
}
