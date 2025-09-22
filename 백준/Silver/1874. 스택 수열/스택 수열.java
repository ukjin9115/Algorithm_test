
import java.util.*;
import java.io.*;
public class Main {
    static Stack<Integer> st = new Stack<>();
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int number =1;
        boolean possible = true;

        for(int i = 0; i < N; i ++){
            int k = Integer.parseInt(br.readLine());
            while(number <= k){
                st.push(number++);
                sb.append("+\n");
            }
            if(st.peek() == k){
                st.pop();
                sb.append("-\n");
            }
            else{
                possible = false;
                break;
            }
        }
        if(possible){
            bw.write(sb.toString());
        }else{
            bw.write("NO");
        }

        bw.close();
        br.close();
    }
}
