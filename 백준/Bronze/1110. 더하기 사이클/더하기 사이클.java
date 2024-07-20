import java.io.*;

public class Main {
    static String get_new_num(String str_num){
        int sum= Integer.parseInt(String.valueOf(str_num.charAt(0))) +Integer.parseInt(String.valueOf(str_num.charAt(1)));
        String num_right = String.valueOf(str_num.charAt(1));

        String str_sum = String.valueOf(sum);
        if(str_sum.length()<2) str_sum="0"+str_sum;

        String sum_right = String.valueOf(str_sum.charAt(1));

        return num_right + sum_right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        if(line.length()<2) line = "0"+line;

        int N=0;
        String str = line;
        while(true){
            N++;
            String newNum = get_new_num(str);

            if(newNum.equals(line)) break;
            else str=newNum;
        }

        bw.write(N+"");
        bw.flush();
        bw.close();
        br.close();
    }
}