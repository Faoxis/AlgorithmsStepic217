import java.util.Scanner;

/**
 * Created by DNefedov on 13.11.15.
 */
public class Step10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numb = in.nextInt();
        int size = in.nextInt();

        int[][] mass = new int[2][numb];


        for(int i = 0; i < numb; ++i) {
            mass[0][i] = in.nextInt();
            mass[1][i] = in.nextInt();
        }


        double sizeNow = size;
        double sum = 0;

        double max = 0;
        int maxInd = 0;

        int count = 0;

        for(int i = 0; i < numb; ++i) {
            double k = 0;
            for(int j = 0; j < numb; ++j) {
                k = ((double)mass[0][j] / mass[1][j]);
                if( k > max) {
                    max = k;
                    maxInd = j;
                }
            }

            if(size != 0) {
                if (size >= mass[1][maxInd]) {
                    sum = sum + mass[0][maxInd];
                    size = size - mass[1][maxInd];
                    mass[0][maxInd] = 0;
                    mass[1][maxInd] = 0;
                    max = 0;
                }
                if (size < mass[1][maxInd]) {
                    sum = sum + ( (double)size / mass[1][maxInd]) * mass[0][maxInd];
                    size = 0;
                }
            }

        }


        System.out.println(sum);

    }
}