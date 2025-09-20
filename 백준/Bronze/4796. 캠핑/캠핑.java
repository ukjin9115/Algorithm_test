
import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = 0;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            number++;
                int L = Integer.parseInt(st.nextToken()); //사용가능일수
                int P = Integer.parseInt(st.nextToken()); //연속하는일
                int V = Integer.parseInt(st.nextToken());  //며칠짜리 휴가?
                //ex) 5 8 20 : 연속8일중 5일 쓸수있고, 휴가 20일
//        20 / 8 = 2 이고 2 * 5 에다가 20 % 8 해서 4일
                if(L==0 && P==0 && V==0) break;
                int answer = (V/P) * L +  Math.min((V%P), L);

                bw.write("Case ");
                bw.write(number +": ");
                bw.write(String.valueOf(answer));
                bw.newLine();

        }



        bw.close();
        br.close();
    }
}
