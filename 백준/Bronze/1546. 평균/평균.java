import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double[] nums = new double[N];
        double max_num=0;

        String[] line = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            nums[i]=Double.parseDouble(line[i]);
        }

        for(int i=0;i<N;i++){
            if(max_num<nums[i])
                max_num=nums[i];
        }

        for(int i=0;i<N;i++){
            nums[i]=nums[i]/max_num*100;
        }

        double avrg = Arrays.stream(nums).sum() / N;

        bw.write(avrg+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
