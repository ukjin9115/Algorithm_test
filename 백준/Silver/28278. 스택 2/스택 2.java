
import java.util.*;
import java.io.*;

class Main {
    static int N;
    static Stack<Integer> st = new Stack<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stz;

    public static void fn(int n) throws IOException{
        if(n==1){
            int x = Integer.parseInt(stz.nextToken());
            st.push(x);
        }
        if(n==2){
            if(!st.isEmpty()) bw.write(st.pop() + "\n");
            else bw.write("-1\n");
        }
        if(n==3) bw.write(st.size() + "\n");
        if(n==4){
            if(st.isEmpty()) bw.write("1\n");
            else bw.write("0\n");
        }
        if(n==5){
            if(!st.isEmpty()) bw.write(st.peek() + "\n");
            else bw.write("-1\n");
        }
    }

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        for(int i  = 0; i < N; i ++){
            stz = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stz.nextToken());
            fn(n);
        }
        bw.close();
        br.close();
    }
}
