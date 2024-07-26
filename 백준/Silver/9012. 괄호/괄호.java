import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T!=0){
            Stack stack = new Stack();
            String[] line = br.readLine().split("");
            int flag = 1;
            for(int i=0;i<line.length;i++){
                if(line[i].equals("(")) stack.push(line[i]);
                else{
                    if(stack.empty()){
                        flag=0;
                        bw.write("NO\n");
                        break;
                    }
                    else stack.pop();
                }
            }
            if(flag==1){
                if(stack.empty()) bw.write("YES\n");
                else bw.write("NO\n");
            }
            T--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}