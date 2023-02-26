package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите искомое число");
        int[] array = Generate(100000000);
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long mily = System.currentTimeMillis();

        System.out.println("Индекс заданного числа: " + BinSearch(array, num));
        System.out.println("Время выполнения двоичного поиска: "+(double) (System.currentTimeMillis() - mily) + " милисекунд");
        System.out.println("Индекс заданного числа: " + LinSearch(array, num));
        System.out.println("Время выполнения перебора: " + (double) (System.currentTimeMillis() - mily) + " милисекунд");
    }
    public static int[] Generate(int leanth1) {
        int[] array = new int[leanth1];

        for(int i = 0; i < array.length; ++i) {
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }

    public static int LinSearch(int[] array, int num) {
        for(int i = 0; i < array.length; ++i) {
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int BinSearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < num) {
                low = mid + 1;
            } else {
                if (array[mid] <= num) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1;
    }
}