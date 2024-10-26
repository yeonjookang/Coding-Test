import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1. 문자열 입력 받기
        String inputStr = br.readLine();

        //2. 결과 문자열, 현재 단어 변수 초기화 + 현재 꺽쇠 단어인지 확인하는 변수 초기화(false)
        String currentWord = "";
        String resultStr = "";
        Boolean isAngle = false;

        //3. 문자열 반복하기
        for(int i=0;i<inputStr.length();i++){
            //3-1. 열린 꺽쇠라면 꺽쇠 단어라고 변수 수정 후 현재 단어는 결과 단어에 저장(순서 반대로) 후, 현재 단어 초기화 후 꺽쇠 추가
            if(inputStr.charAt(i)=='<'){
                if(currentWord.length()>0){
                    for(int j=currentWord.length()-1;j>=0;j--){
                        resultStr+=currentWord.charAt(j);
                    }
                }
                currentWord = "";
                currentWord+="<";
                isAngle = true;
            }

            //3-2. 닫힌 꺽쇠라면 꺽쇠 저장 후 현재까지 단어 결과 단어에 저장(순서 그대로)
            if(inputStr.charAt(i)=='>'){
                currentWord+=">";
                for(int j=0;j<currentWord.length();j++){
                    resultStr+=currentWord.charAt(j);
                }
                currentWord = "";
                isAngle = false;
            }

            //3-3. 공백이라면
            if(inputStr.charAt(i)==' '){
                //3-3-1. 꺽쇠 단어라면 현재 단어에 공백 저장
                if(isAngle) currentWord+=' ';
                //3-3-2. 꺽쇠 단어가 아니라면 공백 저장 후 현재까지 단어 결과 단어에 저장(순서 반대로) 후, 현재 단어 초기화
                if(!isAngle){
                    if(currentWord.length()>0){
                        for(int j=currentWord.length()-1;j>=0;j--){
                            resultStr+=currentWord.charAt(j);
                        }
                    }
                    resultStr+=' ';
                    currentWord = "";
                }
            }

            //3-4. 일반 문자라면 현재 단어에 저장
            if(inputStr.charAt(i)!=' ' && inputStr.charAt(i)!='<' && inputStr.charAt(i)!='>'){
                currentWord+=inputStr.charAt(i);
            }
        }

        //3-5. 마지막이라면 현재까지 단어 결과 단어에 저장(순서 반대로)
        if(currentWord.length()>0){
            for(int j=currentWord.length()-1;j>=0;j--){
                resultStr+=currentWord.charAt(j);
            }
        }

        //4. 결과 출력하기
        bw.write(resultStr);
        bw.flush();
        bw.close();
        br.close();
    }
}
