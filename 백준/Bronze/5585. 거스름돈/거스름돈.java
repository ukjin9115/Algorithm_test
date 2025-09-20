
import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k =1000 - Integer.parseInt(br.readLine());
        int A = k / 500;
        k %= 500;
        int B = k / 100;
        k %= 100;
        int C = k / 50;
        k %=50;
        int D = k / 10;
        k %=10;
        int E = k / 5;
        k %=5;
        int F = k;

        bw.write(String.valueOf(A+B+C+D+E+F));


        bw.close();
        br.close();
    }
}
