import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> queue = new ArrayList<>();

        while(N!=0){
            String[] line = br.readLine().split(" ");
            switch (line[0]){
                case "push":
                    int x = Integer.parseInt(line[1]);
                    queue.add(x);
                    break;
                case "pop":
                    int pop_num= -1;
                    if(queue.size()!=0){
                        pop_num= queue.get(0);
                        queue.remove(0);
                    }
                    bw.write(pop_num+"\n");
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if(queue.size()==0) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    int front_num= -1;
                    if(queue.size()!=0) front_num= queue.get(0);
                    bw.write(front_num+"\n");
                    break;
                case "back":
                    int back_num= -1;
                    if(queue.size()!=0) back_num= queue.get(queue.size()-1);
                    bw.write(back_num+"\n");
                    break;
            }
            N--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}