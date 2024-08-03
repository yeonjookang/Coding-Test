import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strings = new String[N];

        for(int i=0;i<N;i++){
            strings[i]=br.readLine();
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //단어 길이가 같은 경우
                if(s1.length() == s2.length()) return s1.compareTo(s2);
                //단어 길이가 다른 경우
                else return s1.length()-s2.length();
            }
        });

        Set<String> strings_set = new LinkedHashSet<>(Arrays.asList(strings));
        String result = String.join("\n",strings_set);
        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}