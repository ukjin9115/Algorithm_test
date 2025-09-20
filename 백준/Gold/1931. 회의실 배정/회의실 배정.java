

import java.util.*;
import java.io.*;

public class Main {
    static int N;

        //회의 종료시각이 빠른거부터 오름차순 정렬 해놓는다. 시작시간이 그전 종료시각보다 적은 것들은 자동 제외
    //한 회의가 끝난후, 그 종료시간 이후의 시작시간을 갖는 것을 찾고, 그 회의의 종료시각으로 또 반[
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i< N; i ++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new int[]{start, end});
        }
        list.sort((a,b)->{
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        int count = 0;
        int lastEnd = 0;
        for(int[] arr : list){
            if(arr[0] >= lastEnd){
                count++;
                lastEnd = arr[1];
            }
        }
        bw.write(String.valueOf(count));

        bw.close();
        br.close();
    }
}
