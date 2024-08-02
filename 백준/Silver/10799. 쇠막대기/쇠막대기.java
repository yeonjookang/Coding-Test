import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * stack: 현재까지 ( 개수를 저장하기 위한 Stack 
         * pre_input: )이 나왔을 때, 앞에 어떤 게 나왔냐에 따라 나뉘므로 필요한 변수
         * - ()이 나온 경우, stack.pop() 한 후, stack.size 만큼 +
         * - ))이 나온 경우, stack.pop() 한 후, 1만큼 +
         * - (이 나온 경우 stack.add()
         */

        String[] line = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        String pre_input = "";
        int result = 0;

        for(String input: line){
            switch (input){
                case "(":
                    stack.add(input);
                    pre_input=input;
                    break;
                case ")":
                    if(pre_input.equals("(")) {
                        stack.pop();
                        result+=stack.size();
                    }
                    else {
                        stack.pop();
                        result+=1;
                    }
                    pre_input=input;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}