import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        Map<String,Integer> nameCnt = new HashMap<>();

        //이름마다 나온 횟수 저장
        for(int i=0;i<N+M;i++){
            String input_name =br.readLine();

            if(nameCnt.containsKey(input_name)){
                Integer cnt = nameCnt.get(input_name);
                nameCnt.put(input_name,cnt+1);
            }else{
                nameCnt.put(input_name,1);
            }
        }

        List<String> not_see_hear_list= new ArrayList<>();
        Set<String> names = nameCnt.keySet();

        //나온 횟수가 2 이상인 경우 듣도 보도 못한 사람에 추가
        for(String name: names){
            if(nameCnt.get(name)>1) not_see_hear_list.add(name);
        }

        Collections.sort(not_see_hear_list);

        bw.write(not_see_hear_list.size()+"\n");
        for(int i=0;i< not_see_hear_list.size();i++){
            bw.write(not_see_hear_list.get(i)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}