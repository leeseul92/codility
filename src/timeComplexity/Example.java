import java.io.*;
import java.util.*;

public class Example {
    public static void main(String args[]) throws Exception
   {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader("3 17 1 39 8 41 2 32 99 2");
        int T = Integer.parseInt(br.readLine());
        
      for(int test_case = 1; test_case <= T; test_case++)
      {
            int[] nArr = new int[10];
            int rst = 0;
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            
            for(int i = 0; i < 10; i++){
                nArr[i] = Integer.parseInt(str.nextToken());
            }
            
            for(int i = 0; i < 10; i++){
                if(nArr[i] % 2 != 0){
                    rst += nArr[i];
                }
            }
            
            System.out.println("#" + test_case + " " + rst);
        }
   }
}
