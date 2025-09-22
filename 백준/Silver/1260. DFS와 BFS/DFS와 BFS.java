import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] graph;

    static boolean[] visited;
    static int N,M,R;


    public static void dfs(int idx){
        visited[idx] = true;
        System.out.print(idx + " ");
        for (int i = 0 ; i < graph[idx].size(); i ++){
            int next = graph[idx].get(i);
            if(!visited[next]) dfs(next);
        }
    }

    public static void bfs(int idx){
        visited = new boolean[N+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visited[idx] = true;
        while (!q.isEmpty()){
            int n = q.poll();
            System.out.print(n + " ");

            for (int i = 0 ; i < graph[n].size(); i ++){
                int next = graph[n].get(i);
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i <=N; i ++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i <M; i ++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        for(int i = 1; i <=N; i ++){
            Collections.sort(graph[i]);
        }

        dfs(R);
        System.out.println();
        bfs(R);

        bw.close();
        br.close();
    }
}
