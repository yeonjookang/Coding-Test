import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> stack = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        while(N>0){
            String[] line = br.readLine().split(" ");

            switch (line[0]){
                case "push":
                    int x = Integer.parseInt(line[1]);
                    stack.add(x);
                    break;
                case "pop":
                    Integer pop_num = -1;
                    if(stack.size()!=0) {
                        pop_num = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                    }
                    bw.write(pop_num+"\n");
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.size()==0) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "top":
                    Integer top_num = -1;
                    if(stack.size()!=0) {
                        top_num = stack.get(stack.size() - 1);
                    }
                    bw.write(top_num+"\n");
                    break;
            }
            N--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}