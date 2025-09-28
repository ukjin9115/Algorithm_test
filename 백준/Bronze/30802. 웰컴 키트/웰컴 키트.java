

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int shirt = 0;
        int pen = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int muk1 = Integer.parseInt(st2.nextToken());
        int muk2 = Integer.parseInt(st2.nextToken());
        for(int i = 0; i < 6; i ++){
            int k = Integer.parseInt(st.nextToken());
            if(k != 0 &&k  <=  muk1) shirt++;
            else{
                if(k % muk1 == 0) shirt+= (k / muk1);
                else{shirt += (k / muk1) + 1;}
            }
        }
        pen += N / muk2;
        bw.write(String.valueOf(shirt));
        bw.newLine();
        bw.write(pen + " " + (N % muk2));

        bw.close();
        br.close();
    }
}
