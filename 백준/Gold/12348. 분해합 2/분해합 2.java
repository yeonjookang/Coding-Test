import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int length = line.length();

        Long N = Long.parseLong(line);
        Long result = 0L;

        
        // 11과 같이 N-9*length인 경우는 음수가 아닌 0부터 반복하도록 if문 설정
        if(N-9*length<1){
            for(Long i=0L;i<N;i++){
                Long sum=i;

                String str_num = String.valueOf(i);
                for(int j=0;j<str_num.length();j++){
                    //Long 타입은 ==가 아닌 equals 를 사용해야함
                    sum+=Long.parseLong(String.valueOf(str_num.charAt(j)));
                }
                if(sum.equals(N)) {
                    result = i;
                    break;
                }
            }
        }

        // 자리수 * 9가 더해질 수 있는 최대값이므로 이를 이용해 범위값 좁히기
        else{
            for(Long i=N-9*length;i<N;i++){
                Long sum=i;

                String str_num = String.valueOf(i);
                for(int j=0;j<str_num.length();j++){
                    sum+=Long.parseLong(String.valueOf(str_num.charAt(j)));
                }
                if(sum.equals(N)) {
                    result = i;
                    break;
                }
            }
        }


        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}