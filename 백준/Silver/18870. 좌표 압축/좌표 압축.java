
import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            count[i] = num;
        }
        Arrays.sort(count); //[-10,-9,2,4,4]
        int idx = 0;
        int prev = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : count) {
            if (x != prev) {
                map.put(x, idx++);
                prev = x;
            }
        }

//        for(int k : count){
//            if(!map.containsKey(k)){
//                map.put(k, idx++);
//            }
//        }
//
        for(int x : arr){
            bw.write(String.valueOf(map.get(x)) + " ");
        }
        bw.close();
        br.close();
    }
}
