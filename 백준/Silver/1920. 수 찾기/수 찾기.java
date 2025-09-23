

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    static int N,M;
//    static ArrayList<Integer> list = new ArrayList<>();
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i ++){
            if(set.contains(Integer.parseInt(st.nextToken()))){
                bw.write(String.valueOf(1));
                bw.newLine();
            }else{
                bw.write(String.valueOf(0));
                bw.newLine();
            }
        }

        bw.close();
        br.close();
    }
}
