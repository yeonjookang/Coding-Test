import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Map1에는 <포켓몬,번호> 정보를, Map2에는 <번호,포켓몬> 정보를 저장
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        HashMap<String, Integer> poketmonNum = new HashMap<>();
        HashMap<Integer,String> numPoketmon = new HashMap<>();

        for(int i=1;i<=N;i++){
            String input_poketmon = br.readLine();
            poketmonNum.put(input_poketmon,i);
            numPoketmon.put(i,input_poketmon);
        }

        for(int i=0;i<M;i++){
            String input_str = br.readLine();
            if(('A'<=input_str.charAt(0)) && (input_str.charAt(0) <= 'Z')){
                //포켓몬을 입력한 경우
                Integer result = poketmonNum.get(input_str);
                bw.write(result+"\n");
            }else{
                //번호를 입력한 경우
                String result = numPoketmon.get(Integer.parseInt(input_str));
                bw.write(result+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}