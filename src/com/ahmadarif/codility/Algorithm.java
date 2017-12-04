package com.ahmadarif.codility;

/**
 * Created by Arif on 30-Nov-17.
 */
public class Algorithm {

    public int fibonacciRec(int value) throws Exception {
        if (value < 0) throw new Exception("Min number is 0");
        if (value <= 1) {
            return value;
        } else {
            return fibonacciRec(value - 1) + fibonacciRec(value - 2);
        }
    }

    public int fibonacciLoop(int value) {
        int a = 0, b = 1, temp;

        while (value >= 0){
            temp = a;
            a = a + b;
            b = temp;
            value--;
        }

        return b;
    }

}
