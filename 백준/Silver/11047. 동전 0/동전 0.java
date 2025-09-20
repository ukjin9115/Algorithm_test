

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i ++){
            int k = Integer.parseInt(br.readLine());
            list.add(k);
        }
        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        for(int x : list){
            if(K / x > 0){
                count += K / x;
                K %= x;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}
