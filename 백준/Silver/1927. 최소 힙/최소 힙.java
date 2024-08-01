import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 힙(Heap): 완전 이진트리 형태로, 최대/최솟값을 빠르게 찾아내는데 유용한 자료구조
         * 자바에서는 우선순위 큐를 이용하여 힙을 사용할 수 있다.
         * 우선순위가 높은 순서대로 poll() 한다.
         */

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue();

        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x>0) {
                minHeap.add(x);
            }else{
                if(minHeap.isEmpty()) bw.write("0\n");
                else bw.write(minHeap.poll()+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}