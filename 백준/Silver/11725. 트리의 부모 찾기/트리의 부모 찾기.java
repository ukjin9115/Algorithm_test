import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N,M;
    static int[] answer;

    public static void dfs(int idx){
        visited[idx] = true;

        for (int i = 0; i < graph[idx].size(); i ++){
            int next = graph[idx].get(i);
            if(!visited[next]){
                answer[next] = idx;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = N - 1;
        visited = new boolean[N+1];
        answer = new int[N+1];
        graph = new ArrayList[N+1];
        //그래프채우기
        for(int i = 1; i <= N; i ++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i ++){
            st = new StringTokenizer(br.readLine());
            int x  = Integer.parseInt(st.nextToken());
            int y  = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        dfs(1);
        for (int i = 2; i <=N; i ++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
