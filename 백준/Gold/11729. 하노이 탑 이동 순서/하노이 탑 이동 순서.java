

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3, 2);
        System.out.println(count);
        System.out.print(sb);
    }
    public static void hanoi(int n, int start, int end, int help){
        if(n == 1){
            sb.append(start).append(" ").append(end).append("\n");
            count++;
            return;
        }
        hanoi(n -1, start, help, end);
        sb.append(start).append(" ").append(end).append("\n");
        count++;
        hanoi(n -1, help, end, start);
    }
}
