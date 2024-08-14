import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] array_A = new int[N];
        String[] input_str = br.readLine().split(" ");
        for(int i=0;i<N;i++) array_A[i]=Integer.parseInt(input_str[i]);

        int M = Integer.parseInt(br.readLine());

        //HashSet의 contains 메서드 시간복잡도가 O(1)
        HashSet<Integer> set_A = new HashSet<>();
        for(int i=0;i<N;i++) set_A.add(array_A[i]);

        input_str = br.readLine().split(" ");
        for(int i=0;i<M;i++){
            if(set_A.contains(Integer.parseInt(input_str[i]))) bw.write("1\n");
            else bw.write("0\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}