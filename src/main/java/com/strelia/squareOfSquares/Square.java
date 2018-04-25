package com.strelia.squareOfSquares;

public class Square {
    public static boolean isSquare (int n) {
        if (n < 1) return false;

        int sum = 0, num;

        for (num = 0; sum < n;){
            sum += (++num * 2 - 1);
        }

        return num * num == n;
    }
}
