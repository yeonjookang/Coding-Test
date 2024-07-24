import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        /**
         * 규칙 찾기 -> 경우의 수 줄이기
         * 1,0,0,1,0,0,0,0,1,0,0,0,0,0 ...
         * 약수가 홀수 개인 경우가 1 -> 제곱수인경우가 1, 그 외에는 0!
         * 따라서 N보다 작은 제곱수의 개수!
         */

        int cnt=0;
        int i = 1;

        while(true){
            if(i*i<=N) {
                cnt++;
                i++;
            }
            else break;
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}