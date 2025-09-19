

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recursive(N)));

        bw.close();
        br.close();
    }
    public static int recursive(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return recursive(n-1) + recursive(n -2);
    }
}