
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();                 // 맨 위 버림
            q.offer(q.poll());        // 그 다음을 뒤로
        }

        bw.write(q.peek() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}