// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
 * Time Complexity is too long. Need another solution.
 */
class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int min = (Y - X) / D;
        int rest = (Y - X) % D;
        // while(X + (min * D) < Y){
        //     min++;
        // }

        if(rest != 0){
            min++;
        }

        return min;
    }
}