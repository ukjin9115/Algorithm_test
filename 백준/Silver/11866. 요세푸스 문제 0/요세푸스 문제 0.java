
import java.util.*;
import java.io.*;
public class Main {
    static Stack<Character> st = new Stack<>();
    static int N, K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N; i ++){
            q.offer(i);
        }//{1, 2, 3, 4, 5, 6, 7}
        bw.write("<");
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()){
            for(int i = 0; i < K-1; i ++){
                q.offer(q.poll());
            }
            sb.append(q.poll());
            sb.append(", ");
        }
        String str = sb.toString();

        bw.write(str.substring(0, str.length()-2));
        bw.write(">");

        bw.close();
        br.close();
    }
}
