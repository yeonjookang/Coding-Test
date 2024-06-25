import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start=1;
        int end=1;
        int cnt=1;
        int total=1;

        String line = br.readLine();
        int n = Integer.parseInt(line);

        while(end!=n){
            if(total==n){
                cnt++;
                end++;
                total+=end;
            }
            else if(total>n){
                total-=start;
                start++;
            }
            else if(total<n){
                end++;
                total+=end;
            }
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
