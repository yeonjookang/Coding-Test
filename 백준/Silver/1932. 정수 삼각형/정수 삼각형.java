import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //백준 1149번이랑 비슷한 문제(DP)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //triangleNum에 숫자 정보 저장
        int n = Integer.parseInt(br.readLine());
        int[][] triangleNum = new int[n+1][n];

        for (int i = 0; i < triangleNum.length; i++) {
            Arrays.fill(triangleNum[i], -1); // 각 배열값에 대해 -1로 초기화
        }

        for(int i=1;i<=n;i++){
            String[] inputStr = br.readLine().split(" ");
            for(int j=0;j<inputStr.length;j++){
                triangleNum[i][j]=Integer.parseInt(inputStr[j]);
            }
        }

        //DP 초기화
        int[][] dp = new int[n + 1][n];
        dp[1][0]=triangleNum[1][0];

        //반복문 시작
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                if(j==0){
                    //조건1. j==0이면 dp[i-1][0]으로 바로 대입
                    dp[i][j]=dp[i-1][0]+triangleNum[i][j];
                } else if (dp[i-1][j]==-1) {
                    //조건2. dp[i-1][j]==-1이면 dp[i-1][j-1]로 바로 대입
                    dp[i][j]=dp[i-1][j-1]+triangleNum[i][j];
                } else {
                    //조건3. 그외, dp[i][j]=max(dp[i-1][j],dp[i-1][j-1])+triangleNum[i][j]
                    dp[i][j]= Collections.max(List.of(dp[i-1][j],dp[i-1][j-1]))+triangleNum[i][j];
                }
            }
        }

        //결과값 = dp[n] 중 제일 큰 값
        ArrayList<Integer> maxCandidate = new ArrayList();
        for(int i=0;i<n;i++){
            maxCandidate.add(dp[n][i]);
        }
        int max = Collections.max(maxCandidate);
        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
