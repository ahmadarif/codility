package com.ahmadarif.codility.lesson4;

import java.util.Arrays;

/**
 * Created by Arif on 08-Dec-17.
 */
public class MissingInteger {

    public static void main(String[] args) {
//        System.out.printf("Result = %d\n", solution2(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.printf("Result = %d\n", solution2(new int[]{1, -1, 1, 2, 4}));
//        System.out.printf("Result = %d\n", solution2(new int[]{2}));
//        System.out.printf("Result = %d\n", solution2(new int[]{-1000, 1000}));
//        System.out.printf("Result = %d\n", solution2(new int[]{1}));
//        System.out.printf("Result = %d\n", solution2(new int[]{1, 2}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] <= 0) return 1;
        if (A.length == 1 && A[0] == 2) return 1;

        int prev, next;
        int find = 1;
        for (int i = 0; i < A.length - 1; i++) {
            prev = A[i];
            next = A[i + 1];

            if (prev > 0) {
//                System.out.format("Prev = %d, Next = %d, Find = %d\n", prev, next, find);
                if (prev != find) return find;

                if (prev + 1 == next) {
                    find = next;
                } else if (prev == next) {
                    find = prev;
                } else {
                    return find + 1;
                }
            }
        }
        return find + 1;
    }

    public static int solution2(int[] A) {
        Arrays.sort(A);
        int min = 1;
        for (int a : A) {
            if (a == min) min++;
        }
        return min;
    }

}
