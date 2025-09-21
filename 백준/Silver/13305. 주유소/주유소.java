

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] km = new int[N-1]; //    [2, 3, 1]
        int[] price = new int[N]; // [5, 2, 4, 1]
        for(int i = 0; i < N-1; i++){
            km[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            price[i] = Integer.parseInt(st.nextToken());
        }
        long answer = 0;
        long minPrice = price[0];
        for(int i = 0; i < N-1; i++){
            if(price[i] < minPrice) minPrice = price[i];
            answer += minPrice * km[i];
        }


//        answer += price[0] * km[0];
        //price 배열에서, 자기보다 낮은 값 찾을때까지 탐색
//        for(int i = 1; i <N; i++){
//            int min = price[1];
//            if(min >= price[i]){
//                int sumKm = 0;
//                for(int j = 1; j < i; j ++){
//                    sumKm += km[j];
//                }
//                answer += sumKm * min;
//                min = price[i];
//            }
//        }
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }
}
