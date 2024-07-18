import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int C = Integer.parseInt(line[1]);
        int[] cycle_nums = new int[N];
        for(int i=0;i<N;i++){
            cycle_nums[i]=Integer.parseInt(br.readLine());
        }

        /**
        Arrays.sort(cycle_nums);

        //최소공배수 = 최대공약수*a*b (a,b는 A,B를 각각 최대공약수로 나눈 수)

        //최대공약수 구하기
        int g = 1;

        for(int i=cycle_nums[0];i>0;i--){
            int flag=1;
            for(int j=0;j<cycle_nums.length;j++){
                if(cycle_nums[j]%i!=0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                g=i;
                break;
            }
        }

        //최소공배수 구하기
        int l = g;
        for(int i=0;i<cycle_nums.length;i++){
            l *= (cycle_nums[i]/g);
        }
        **/


        //위에 다 필요 업엇다....;_;
        //폭죽 터지는 경우 구하기
        int cnt = 0;
        for(int i=1;i<=C;i++){
            for(int j=0;j<cycle_nums.length;j++){
                if(i%cycle_nums[j]==0){
                    cnt++;
                    break;
                }
            }
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
