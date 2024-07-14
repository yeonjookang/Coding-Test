import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        while(line.charAt(0)!='0' || line.length()!=1){
            int start_index=0;
            int end_index=line.length()-1;
            int flag=1;

            while(start_index<end_index){
                if(line.charAt(start_index)!=line.charAt(end_index)){
                    flag=0;
                    break;
                }
                start_index++;
                end_index--;
            }

            if(flag==1) bw.write("yes\n");
            else bw.write("no\n");

            line = br.readLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}