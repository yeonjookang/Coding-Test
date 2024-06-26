import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] nums = new int[N];

        if(N<3){
            bw.write(0);
            bw.flush();
            bw.close();
            br.close();

            return;
        }

        for(int i=0;i<N;i++){
            nums[i]=Integer.parseInt(line[i]);
        }

        Arrays.sort(nums);
        int cnt=0;

        for(int i=0;i<N;i++){
            int target_num=nums[i];

            int start_index=0;
            int end_index=N-1;
            int sum=nums[start_index]+nums[end_index];

            while(start_index!=end_index){
                sum=nums[start_index]+nums[end_index];
                if(sum>target_num){
                    end_index--;
                }
                else if(sum<target_num){
                    start_index++;
                }
                else{ //sum==N
                    //합이 N이 되어도 자기 자신인지 체크하여야 한다.
                    //자기 자신인 경우에도, start_index++를 할지 end_index++를 할지 정하기 위해 경우의 수를 나눠야 한다.
                    if(start_index==i){
                        start_index++;
                    }
                    else if(end_index==i){
                        end_index--;
                    }
                    else{
                        cnt++;
                        break;
                    }
                }
            }
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}