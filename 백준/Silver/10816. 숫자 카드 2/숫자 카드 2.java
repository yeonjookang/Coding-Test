import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Map 자료구조에 숫자와 개수 정보 저장
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> numsCnt = new HashMap<>();

        String[] line = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            int input_num=Integer.parseInt(line[i]);

            if(numsCnt.containsKey(input_num)){
                Integer cnt = numsCnt.get(input_num);
                numsCnt.put(input_num,cnt+1);
            }else{
                numsCnt.put(input_num,1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] nums2 = new int[M];
        String[] line2 = br.readLine().split(" ");

        for(int i=0;i<M;i++){
            nums2[i]=Integer.parseInt(line2[i]);
        }

        int[] result = new int[M];

        for(int i=0;i<M;i++){
            Integer cnt = numsCnt.get(nums2[i]);
            if(cnt==null) result[i]=0;
            else result[i]=cnt;
        }

        for(int i=0;i<M;i++){
            bw.write(result[i]+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}