package week1;

import java.util.Scanner;

/**
 * Created by Sergei on 15.03.2016.

     Дано число 1≤n≤1071≤n≤107, необходимо найти последнюю цифру nn-го числа Фибоначчи.
     Как мы помним, числа Фибоначчи растут очень быстро, поэтому при их вычислении
     нужно быть аккуратным с переполнением. В данной задаче, впрочем,
     этой проблемы можно избежать, поскольку нас интересует только последняя цифра числа Фибоначчи:
     если 0≤a,b≤90≤a,b≤9 — последние цифры чисел FiFi и Fi+1Fi+1 соответственно, то (a+b)mod10(a+b)mod10 —
     последняя цифра числа Fi+2Fi+2.
 */



public class Fibonacci2 {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//считываем целое число

        int[] mass = new int[a+1];

        mass[0] = 0;
        mass[1] = 1;

        for(int i = 2; i <= a; ++i)
        {
            mass[i] = (mass[i-1] + mass[i-2]) % 10;
        }

        System.out.println(mass[a]);
    }
}
