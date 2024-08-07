package com.hillel.andriuta.lessons.lesson8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Integer[] array = {99, 7, -2, 6 ,-20, 100, -55};

        int current;
        int next;
        int counter = 0;*/

       /*     for (int j = 0; j < array.length - 1; j++) {
                counter++;
                current = array[j];
                next = array[j + 1];

                if (current > next) {
                    array[j + 1] = current;
                    array[j] = next;
                }
            }*/

     /*   for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i ; j++) {
                counter++;
                current = array[j];
                next = array[j + 1];

                if (current > next) {
                    array[j + 1] = current;
                    array[j] = next;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);*/

       /*  Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));*/

        /*Integer[] array = {99, 7, -2, 6 ,-20, 100, -55};

        int max = array[0];
        int maxIndex = 0;
        int min = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array [i]) {
                max = array[i];
                maxIndex = i;

               // OR max = Math.max (max, array[i]); (no index)

            }
            if (min > array [i]){
                min = array[i];
                minIndex = i;

                // OR min = Math.min(min, array[i]); (no index)
            }

        }
        System.out.println(min + ", " + max);
        System.out.println(minIndex + ", " + maxIndex);*/

        /*int[] array = {99, 7, -2, 6 ,-20, 100, -55, 43, 22, 85, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array, 7));*/

       /* int element = -20;
        int elementIndex = -1;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
           int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == element) {
                elementIndex = middleIndex;
                break;
            } else if (array[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
           }
        }
        System.out.println(elementIndex);*/
        /**
         * O(logN)
         * Самый худший вариант для массива из 16 элементов
         * N = 16 - 2^4
         * N = 8 - 2^3
         * N = 4 - 2^2
         * N = 2 - 2^1
         * N = 1 - 2^0
         * <p>
         * 2^4=16 - 2^k = N или из математики     k = log2N
         * O(k) = O(log2N)
         * Основание логарифма является константой поэтому не играет роли:
         * O(k) = O(logN)
         */

      /*  int[] array1 = {1, 2 ,3 ,4 ,5};

        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = Arrays.copyOf(array1, 2);
        int[] array4 = Arrays.copyOfRange(array1, 2, array1.length);
        int[] array5 = new int[array1.length];
                System.arraycopy(array1, 2, array5,2, array1.length - 2);

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));*/


        int N = -1;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter array length");
        while (true){
            if (scanner.hasNextInt() ) {
                 N = scanner.nextInt();
                 if(N % 2 == 0) {
                     break;
                 } else {
                     System.out.println("Please enter even number");
                 }
            } else {
                System.out.println("Wrong data, try again");
                scanner.next();
            }
        }
        Integer array[] = new Integer[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println("Your array: " + Arrays.toString(array));

        int mid = array.length / 2;
        Integer[] first = new Integer[mid];
        Integer[] second = new Integer[mid];

        System.arraycopy(array, 0, first, 0, mid);
        System.arraycopy(array, mid, second, 0, mid);

        System.out.println("First half: " + Arrays.toString(first));
        System.out.println("Second half: " + Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second, Collections.reverseOrder());

        System.out.println("Sorted first half: " + Arrays.toString(first));
        System.out.println("Sorted second half: " + Arrays.toString(second));
    }
}


