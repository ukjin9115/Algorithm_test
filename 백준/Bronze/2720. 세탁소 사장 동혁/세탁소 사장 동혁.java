

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int k = Integer.parseInt(br.readLine());
            int quarter = k / 25;
            k %= 25;
            int dime = k / 10;
            k %= 10;
            int nickel = k / 5;
            k %= 5;
            int penny = k / 1;
            bw.write(quarter+" "+dime+" "+nickel+" "+penny);
            bw.newLine();

        }
        bw.close();
        br.close();
    }
}
