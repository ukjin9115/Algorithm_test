

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] arr = str.split("-");
        int[] list = new int[arr.length];

        for(int i = 0; i < arr.length; i ++){
            if(arr[i].contains("+")){
                String[] k = arr[i].split("\\+");// + 는 정규식에서 특별문자라서 \\+ 로 처리해야 함
                int sum = 0;
                for(String s : k){
                    sum += Integer.parseInt(s);
                }
                list[i] = sum;
            }else{
                list[i] = Integer.parseInt(arr[i]);
            }
        }
        //[30, 70, 20+40, 10+100+30, 35]
        int answer = list[0];
        for(int i = 1; i < list.length; i ++){
            answer -= list[i];
        }
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }
}
