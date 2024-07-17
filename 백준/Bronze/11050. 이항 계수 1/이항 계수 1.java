import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /**
         * 이항계수
         * nCk = n!/(n-k)!k! (단, 0<=k<=n)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        int n_pac=1;
        int k_pac=1;
        int n_minus_k_pac=1;

        for(int i=1;i<=N;i++){
            n_pac*=i;
        }

        for(int i=1;i<=K;i++){
            k_pac*=i;
        }

        for(int i=1;i<=N-K;i++){
            n_minus_k_pac*=i;
        }

        int result = n_pac/(n_minus_k_pac*k_pac);

        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}