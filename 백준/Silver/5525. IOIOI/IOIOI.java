

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count = 0;
        int seq = 0;
        for(int i = 1; i < M-1; i ++){
            if(s.charAt(i) == 'O' && s.charAt(i-1) == 'I'&&s.charAt(i+1) == 'I'){
                seq ++;
                i++;
                if(seq >= N ) count++;
            }else{
                seq = 0;
            }
        }


        //N입력을 기반으로 찾아야할 문자열 sb 생성
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 2*N+1; i ++){
//            if(i % 2 == 1){
//                sb.append("O");
//            }else sb.append("I");
//        }
//        String str = sb.toString(); //찾을 기준이 되는 문자열
//        int length = str.length();
//
//        for(int i = 0; i <= M-length; i ++){
//            String newS = s.substring(i,i+length);
////                if(newS.equals(str)) count++;
//            map.put(newS,map.getOrDefault(newS,0)+1);
//        }

        //전체 문자열 길이는 2N+1이고, N의 개수만큼 O, N+1만큼 I
        //S에 Pn이 얼마나 포함되어있는지 카운팅
        bw.write(String.valueOf(count));


        bw.close();
        br.close();
    }
}
