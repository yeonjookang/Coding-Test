import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        String[] line = br.readLine().split(" ");
        int[] nums = new int[N];

        for(int i=0;i<N;i++){
            nums[i]=Integer.parseInt(line[i]);
        }

        Arrays.sort(nums);

        int start_index=0;
        int end_index=N-1;
        int cnt=0;

        int sum=nums[start_index]+nums[end_index];

        while(start_index!=end_index){
            sum=nums[start_index]+nums[end_index];

            if(sum>M){
                end_index--;
            }
            else if(sum<M){
                start_index++;
            }
            else{ //sum==M
                cnt++;
                start_index++;
            }
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}