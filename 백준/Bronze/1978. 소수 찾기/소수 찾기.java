import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        String[] line = br.readLine().split(" ");
        int[] nums= new int[N];
        for(int i=0;i<N;i++){
            nums[i]=Integer.parseInt(line[i]);
        }

        int result=0;

        for(int i=0;i<N;i++){
            int flag=1;
            if(nums[i]==1){
                flag=0;
            } else if (nums[i]==2) {
                flag=1;
            } else if (nums[i]==3) {
                flag=1;
            } else {
                for(int j=2;j<=nums[i]/2;j++){
                    if(nums[i]==1 || nums[i]%j==0){
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1)
                result++;
        }

        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
