

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null && !line.equals("")) {
            list.add(Integer.parseInt(line));
        }

        Collections.sort(list);

        int N = list.size();
        int sum = 0;
        for (int k : list) sum += k;

        // 평균
        System.out.println(sum / N);

        // 중앙값
        System.out.println(list.get(N / 2));

        br.close();
    }
}