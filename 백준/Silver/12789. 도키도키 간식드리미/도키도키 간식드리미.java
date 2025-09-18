import java.util.*;
import java.io.*;
public class Main {

    static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        Stack<Integer> st = new Stack<>();
        int cur = 1;
        for(int i = 0; i < N; i ++){
            int n = Integer.parseInt(tk.nextToken());
            if(n == cur) cur++;
            else{
                st.push(n);
            }

            while(!st.isEmpty() && st.peek() == cur){
                st.pop();
                cur++;
            }

        }
        if(st.isEmpty()) bw.write("Nice");
        else bw.write("Sad");


        bw.close();
        br.close();
    }
}
