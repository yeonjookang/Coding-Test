import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strings = new String[N];

        for(int i=0;i<N;i++){
            strings[i] = br.readLine();
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] s1_arr = s1.split(" ");
                String[] s2_arr = s2.split(" ");

                int s1_age = Integer.parseInt(s1_arr[0]);
                int s2_age = Integer.parseInt(s2_arr[0]);

                return s1_age-s2_age;
            }
        });

        String result = String.join("\n",strings);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}