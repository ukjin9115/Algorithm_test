

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        long k = 1;
        if(N != 0){
            for(int i = N; i >= 1; i--) {
                k *= i;
            }
            bw.write(String.valueOf(k));
        }
        else{
            bw.write(String.valueOf(1));
        }
        bw.close();
        br.close();
    }


}
