package week1;

/**
 * Created by Sergei on 15.03.2016.
 */


/*
Дано целое число 1≤n≤401≤n≤40,
необходимо вычислить nn-е число Фибоначчи
(напомним, что F0=0F0=0, F1=1F1=1 и Fn=Fn−1+Fn−2Fn=Fn−1+Fn−2 при n≥2n≥2).
 */


import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//считываем целое число

        int[] mass = new int[a+1];
//
        mass[0] = 0;
        mass[1] = 1;

        for(int i = 2; i <= a; ++i)
        {
            mass[i] = mass[i-1] + mass[i-2];
        }

        System.out.println(mass[a]);
    }


}
