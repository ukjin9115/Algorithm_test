
import java.util.*;
import java.io.*;
public class Main {

    static Queue<Integer> q;
    static int N,M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;
        N = Integer.parseInt(br.readLine());
        String[] arrA = br.readLine().split(" ");//자료구조
        String[] arrB = br.readLine().split(" ");//구조원소
        M = Integer.parseInt(br.readLine());//삽입할 원소 개수

        tk = new StringTokenizer(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < N; i++ ){
            if(Integer.parseInt(arrA[i]) ==0 ){
                dq.offer(Integer.parseInt(arrB[i]));
            }
        }

        for(int i = 0; i < M; i ++){
            int x = Integer.parseInt(tk.nextToken());
            dq.offerFirst(x);
            bw.write(dq.pollLast() + " ");
        }

        bw.close();
        br.close();
    }
}
