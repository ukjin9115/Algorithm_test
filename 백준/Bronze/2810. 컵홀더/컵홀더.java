

import java.util.*;
import java.io.*;

public class Main
{
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        double count = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'S') count++;
            else if(s.charAt(i) == 'L') count+=0.5;
        }
        int answer = Math.min((int)count , N);
        bw.write(String.valueOf(answer));



        bw.close();
        br.close();
    }
}
