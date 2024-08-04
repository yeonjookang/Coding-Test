import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] lines = new String[N];

        for(int i=0;i<N;i++){
            lines[i]=br.readLine();
        }

        Arrays.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] s1_line = s1.split(" ");
                int s1_x = Integer.parseInt(s1_line[0]);
                int s1_y = Integer.parseInt(s1_line[1]);

                String[] s2_line = s2.split(" ");
                int s2_x = Integer.parseInt(s2_line[0]);
                int s2_y = Integer.parseInt(s2_line[1]);

                if(s1_x!=s2_x) return s1_x-s2_x;
                else return s1_y-s2_y;
            }
        });

        String result= String.join("\n",lines);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}