import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        int num_bigger=Integer.parseInt(line[0]);
        int num_smaller=Integer.parseInt(line[1]);

        if(num_bigger<num_smaller){
            int tmp=num_bigger;
            num_bigger=num_smaller;
            num_smaller=tmp;
        }

        //최소공배수
        int i=1;
        while(num_smaller*i%num_bigger!=0)
            i++;
        int least_common_multiple=num_smaller*i;
        
        //최대공약수
        int greatest_common_divisor=0;
        for(int j=num_smaller;j>0;j--){
            if(num_smaller%j==0 && num_bigger%j==0) {
                greatest_common_divisor = j;
                break;
            }
        }
        bw.write(greatest_common_divisor+"\n");
        bw.write(least_common_multiple+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}