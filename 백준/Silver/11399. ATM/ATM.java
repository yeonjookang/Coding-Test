import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 부분합(누적합) 문제
         * 구간 합이 필요한 경우, 합 배열을 미리 구해두면 시간복잡도를 O(n)에서 O(1)로 줄일 수 있다.
         * int split_num = S[j]-S[i]; => O(1)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array_P = new int[N];
        String[] input_str = br.readLine().split(" ");
        for(int i=0;i<N;i++) array_P[i] = Integer.parseInt(input_str[i]);

        //수 정렬
        Arrays.sort(array_P);
        //누적 합 구하기
        int[] sum_array = new int[N];
        for(int i=0;i<N;i++){
            if(i==0) sum_array[i]=array_P[i];
            else sum_array[i] = sum_array[i-1]+array_P[i];
        }

        int result = 0;
        for(int i=0;i<N;i++) result+=sum_array[i];

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}