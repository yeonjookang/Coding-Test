import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=1;i<=N;i++){
            if(i<100) cnt++;
            else {
                String str_num = String.valueOf(i);
                int flag=1;
                for(int j=0;j<str_num.length()-2;j++){
                    int first_diff = Integer.parseInt(String.valueOf(str_num.charAt(j+1)))-Integer.parseInt(String.valueOf(str_num.charAt(j)));
                    int second_diff = Integer.parseInt(String.valueOf(str_num.charAt(j+2)))-Integer.parseInt(String.valueOf(str_num.charAt(j+1)));

                    if(first_diff==second_diff) continue;
                    else{
                        flag=0;
                        break;
                    }
                }
                if(flag==1) cnt++;
            }
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}