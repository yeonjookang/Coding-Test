import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int[] nums = new int[3];
        for(int i=0;i<3;i++){
            nums[i]=Integer.parseInt(line[i]);
        }
        while(nums[0]!=0 || nums[1]!=0 || nums[2]!=0){
            int max=0;
            int max_index=-1;
            for(int i=0;i<3;i++) {
                if (nums[i] > max){
                    max = nums[i];
                    max_index=i;
                }
            }
            int a_b=0;
            int c=nums[max_index]*nums[max_index];
            for(int i=0;i<3;i++){
                if(i!=max_index)
                    a_b+=nums[i]*nums[i];
            }
            if(a_b==c)
                bw.write("right\n");
            else
                bw.write("wrong\n");

            line = br.readLine().split(" ");
            nums = new int[3];
            for(int i=0;i<3;i++){
                nums[i]=Integer.parseInt(line[i]);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}