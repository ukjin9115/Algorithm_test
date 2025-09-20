

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int sum;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i < N; i ++){
            sum += (N-i) * arr[i] ;
        }

        bw.write(String.valueOf(sum));

        bw.close();
        br.close();
    }
}
