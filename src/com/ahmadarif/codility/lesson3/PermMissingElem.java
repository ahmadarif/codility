package com.ahmadarif.codility.lesson3;

/**
 * Created by Arif on 01-Dec-17.

 A zero-indexed array A consisting of N different integers is given. The array contains integers in the range
 [1..(N + 1)], which means that exactly one element is missing.

 Your goal is to find that missing element.

 Write a function:
        class Solution { public int solution2(int[] A); }
 that, given a zero-indexed array A, returns the value of the missing element.

 For example, given array A such that:
 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5
 the function should return 4, as it is the missing element.

 Assume that:
 - N is an integer within the range [0..100,000];
 - the elements of A are all distinct;
 - each element of array A is an integer within the range [1..(N + 1)].

 Complexity:
 - expected worst-case time complexity is O(N);
 - expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 */
public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 5, 3, 1, 2 }));
        System.out.println(solution(new int[] { 2, 1 }));
        System.out.println(solution(new int[] { 1 }));
        System.out.println(solution(new int[] { 2 }));
        System.out.println(solution(new int[] { 10, 8, 1, 2, 3, 5, 9, 4, 6 }));
    }

    public static int solution(int[] A) {
        int N = A.length + 1;
        int sum = N * (N + 1) / 2;
        for (int i = 0; i < A.length; i++) sum -= A[i];
        return sum;
    }

}