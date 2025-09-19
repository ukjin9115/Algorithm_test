

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i ++){
            num = 0; // 반복마다 초기화
            String str = br.readLine();
            bw.write(String.valueOf(isPalindrome(str)));
            bw.write(" " + String.valueOf(num));
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static int recursion(String s, int l, int r){
        num++;
        if( l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

}
