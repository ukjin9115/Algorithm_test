

import java.io.*;
import java.util.*;

public class Main {
    static  int N,M,R;
    static  boolean[] visited;
    static  ArrayList<Integer>[] map;
    static  int[] answer;
    static  int count = 1;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void dfs(int idx)throws IOException{
        visited[idx] = true;
        answer[idx] = count++;
        for(int i = 0; i < map[idx].size(); i ++){
            int next = map[idx].get(i);
            if (!visited[next]) dfs(next);
        }
    }


    public static void main(String[] args) throws IOException{

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //정점수
        M = Integer.parseInt(st.nextToken());   //간선수
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        answer = new int[N+1];
        map = new ArrayList[N+1];

        for(int i = 1; i <= N; i ++){
            map[i] = new ArrayList<>();
        }


        //1.그래프 기록
        for(int i = 0; i < M; i ++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x].add(y);
            map[y].add(x);
        }
        // 그래프 오름차순
        for(int i = 1; i < map.length; i ++){
            Collections.sort(map[i]);
        }



        //2.경로 찾기(dfs) 수행
        dfs(R);
        //3출력
        for(int i  = 1; i < answer.length; i ++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
