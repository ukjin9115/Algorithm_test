

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            int k = Integer.parseInt(br.readLine());
            int btA = k / 300;
            k %= 300;
            int btB = k / 60;
            k %= 60;
            int btC = k / 10;
            k %=10;
            if(k % 10 != 0) bw.write(String.valueOf(-1));
            else bw.write(btA+" "+btB+" "+btC);

        bw.close();
        br.close();
    }
}
