import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        int[] nums = new int[N];
        List<Integer> result = new ArrayList<>();
        int current_index=0;

        for(int i=0;i<N;i++){
            int T = K-1;
            while(true){
                if(nums[current_index]==-1) {
                    current_index++;
                    current_index=current_index%N;
                    continue;
                }
                if(T!=0){
                    T--;
                    current_index++;
                    current_index=current_index%N;
                    continue;
                }
                nums[current_index]=-1;
                result.add(current_index+1);
                break;
            }
        }

        String listString = result.toString();
        listString = listString.replace('[', '<').replace(']', '>');

        bw.write(listString+"");
        bw.flush();
        bw.close();
        br.close();
    }
}