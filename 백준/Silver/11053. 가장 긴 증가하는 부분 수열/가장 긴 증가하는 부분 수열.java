import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //DP[N]에는 N번째 숫자가 포함된 가장 긴 증가하는 부분 수열 길이
        //NUM[1]~NUM[N-1] 중 NUM[N]보다 작은 수가 있다면, DP[N] = DP[I]가 가장 큰 값 + 1

        int N = Integer.parseInt(br.readLine());
        int[] inputNums = new int[N];
        String[] inputStr = br.readLine().split(" ");
        for(int i=0;i<N;i++) inputNums[i]=Integer.parseInt(inputStr[i]);
        int[] dp = new int[N];
        dp[0] = 1;
        int mx = 1;

        for(int i=1;i<N;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(inputNums[i]>inputNums[j]){
                    if(dp[i]<dp[j]+1) dp[i] = dp[j]+1;
                }
            }
            if(mx<dp[i])
                mx = dp[i];
        }

        bw.write(mx+"");
        bw.flush();
        bw.close();
        br.close();
    }
}