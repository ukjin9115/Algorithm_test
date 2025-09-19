

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
    public static long recursive(int n) {
        if (n <= 1) return 1;
        return n * recursive(n - 1);
    }
}