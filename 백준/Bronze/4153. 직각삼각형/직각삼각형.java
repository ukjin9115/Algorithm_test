

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 & b == 0 && c == 0) break;
            Integer[] arr = new Integer[]{a,b,c};
            Arrays.sort(arr, Collections.reverseOrder());

            if(arr[2]*arr[2] + arr[1]*arr[1] == arr[0]*arr[0]) {
                bw.write("right");
                bw.newLine();
            }
            else {
                bw.write("wrong");
                bw.newLine();
            }
        }
        bw.close();
        br.close();
    }
}
