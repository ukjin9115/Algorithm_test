

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        recursive(N);
        fibo(N);
        bw.write(count1 + " " + count2);
        bw.close();
        br.close();
    }

    public static int recursive(int n){
        if(n ==1 || n == 2) {
            count1++;
            return 1;
        }
        else return recursive(n-1) + recursive(n-2);
    }
    public static void fibo(int n){

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; i ++){
            count2++;
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
}
