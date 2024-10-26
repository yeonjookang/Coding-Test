import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String regex = ".*FBI.*";
        List<Integer> fbiList = new ArrayList<>();

        for(int i=1;i<6;i++){
            String inputStr = br.readLine();
            boolean isFBI = Pattern.matches(regex, inputStr);
            if(isFBI) fbiList.add(i);

        }

        String result="";

        if(fbiList.size()==0)
            result = "HE GOT AWAY!";
        if(fbiList.size()>0){
            for(int i=0;i< fbiList.size();i++){
                result += fbiList.get(i)+" ";
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
