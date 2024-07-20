import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] mushrooms = new int[10];
        for(int i=0;i<10;i++) mushrooms[i]=Integer.parseInt(br.readLine());

        int sum=0;
        int result=-1;

        for(int i=0;i<10;i++){
            sum+=mushrooms[i];

            //끝까지 다 먹은 경우
            if(i==9 && sum<=100){
                result = sum;
                break;
            }

            //100을 넘은 경우
            if(sum>100){
                if(i==0){
                    result = sum;
                    break;
                }
                if(100-sum+mushrooms[i]>=sum-100)
                    result = sum;
                else result = sum-mushrooms[i];

                break;
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}