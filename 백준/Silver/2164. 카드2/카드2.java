import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        /**
         * 덱(Deque) 시간복잡도
         * - 맨 앞 또는 뒤에 삽입/삭제: O(1)
         * - 원소를 탐색하는 경우: O(1) => 인덱스 접근
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) deque.addLast(i+1);

        while(deque.size()!=1){
            deque.pop();
            Integer pop_num = deque.pop();
            deque.addLast(pop_num);
        }

        bw.write(deque.getFirst()+"");
        bw.flush();
        bw.close();
        br.close();
    }
}