import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        for(int i=0;i<N;i++){
            int input_num = Integer.parseInt(br.readLine());
            nums[i]=input_num;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            bw.write(nums[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}