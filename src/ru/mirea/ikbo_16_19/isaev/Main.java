package ru.mirea.ikbo_16_19.isaev;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <=n; i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
	/////////////////Task 3/////////////////////////
        /*
        int[] array = new int[10];
        int sum = 0, count = 0;
        /*for(int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random() * 100);
            sum += array[i];
        }
        System.out.println(sum);
        */

        ////////////////Task3.2///////////////////
        /*do {
            array[count] = (int)(Math.random() * 100);
            sum += array[count];
            count++;
        } while(count < array.length);
        System.out.println(sum);
         */

        ///////////////Task 4//////////////
        /*
        for(int i = 0; i < args.length; i++) {
            System.out.println("Аргумент = " + args[i]);
        }
        */
        ////////////Task 5////////////////////
        /*
        String result;
        for(float i = 0f; i < 10; i++) {
            result = String.format("%.3f", 1/(i+1));
            System.out.println(result);
        }
         */
        //////////Task 6//////////////////////
        /*
        int [] array = new int[10];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i ++) {
            array[i] = (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println("\nСортированный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

         */

        /*int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(factorial(n));
         */
    }
}
