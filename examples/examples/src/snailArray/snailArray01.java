package snailArray;
/**
 * @author leeseul kim
 * @since 7th Aug 20
 * 
 */

public class snailArray01 {
    public static void main(String[] args) {
        //  1   2   3   4   5
        //  16  17  18  19  6
        //  15  24  25  20  7
        //  14  23  22  21  8
        //  13  12  11  10  9

        //need  5x5 array
        //i am gonna put and fill the elements in secondary array first, and then i will print out it.
        
        //sequence is → ↓ ← ↑
        //In 5x5 array, the counting of incresing value is 5 -> 4 -> 4 -> 3 -> 3 -> 2 -> 2 -> 1 -> 1
        int[][] snailArr = new int[5][5]; //[j][i] [y][x]
        int num = snailArr.length;
        //set the index variables for rows, columns
        int row = 0;
        int col = -1;
        int incr = 1; //index increasing value
        int val = 1;

        while(num > 0){
            //first step of sequence is num = 5
            for(int i = 0; i < num; i++){
                col += incr;
                snailArr[row][col] = val;
                val++;
            }
            //need to decrease 'num'
            num--;
            //the break point
            if(num == 0) break;
            for(int i = 0; i < num; i++){
                row += incr;
                snailArr[row][col] = val;
                val++;
            }
            //after finishing second step, the directions of index becomes opposite side
            incr *= -1; 
        }

        //To print
        for(int i = 0; i < snailArr.length; i++){
            for(int j = 0; j < snailArr[i].length; j++){
                System.out.printf(snailArr[i][j] + "\t");
            }
            System.out.println();
        }
    }//main
}