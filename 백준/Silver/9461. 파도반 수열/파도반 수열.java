

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine());
        for(int i =0; i < K; i ++ ){
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[110];
            dp[1]=dp[2]=dp[3] = 1;
            dp[4]=dp[5] = 2;

            for(int j = 6; j <=N; j++ ){
                dp[j] = (dp[j-1] + dp[j-5]);
            }
            bw.write(String.valueOf(dp[N]));
            bw.newLine();
        }
        //
//        n = 8 이면 p(n) = 5인데
//        p(7) + p(3) = p(n-1) + p(n-5)
//        n = 9면
//        p(8) + p(4)
        bw.close();
        br.close();
    }
}
