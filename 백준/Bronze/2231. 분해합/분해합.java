import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;


        for(int i=0;i<N;i++){
            String str_num = String.valueOf(i);
            int sum = i;
            for(int j=0;j<String.valueOf(i).length();j++){
                sum += Integer.parseInt(String.valueOf(str_num.charAt(j)));
            }
            if(sum==N){
                result = i;
                break;
            }
        }

        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}