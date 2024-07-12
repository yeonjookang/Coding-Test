import java.io.*;

public class Main {
    static int M = -1;
    static int result = -1;

    /**
     * <조합 재귀로 구현하기>
     * - i번째 숫자를 고를 경우 visited[i]=true, 고르지 않을 경우 visited[i]=false
     * - r은 뽑을 개수로, i번째 숫자를 고르는 경우 -1 한다.
     * - 종료조건: r이 0이 되거나, depth==n이 되면 재귀를 종료한다.
     */
    public static void combination(int[] nums,boolean[] visited,int depth,int r){
        if(r==0){
            int sum = calculateSum(nums, visited);
            if(sum>result && sum<=M)
                result = sum;
            return;
        }
        if(depth==nums.length) {
            return;
        } else{
          visited[depth]= true;
          combination(nums,visited,depth+1,r-1);

          visited[depth]= false;
          combination(nums,visited,depth+1,r);
        }

    }

    private static int calculateSum(int[] nums, boolean[] visited) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true)
                sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);
        int[] nums = new int[N];
        boolean[] visited = new boolean[N];

        line = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            nums[i]=Integer.parseInt(line[i]);
        }

        combination(nums,visited,0,3);

        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}