package chap1;

/*
문제 ID: 01-04
제목: 4. 단어 뒤집기

설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

예시 입력 1
3
good
Time
Big

예시 출력 1
doog
emiT
giB
*/
import java.io.*;
public class c1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] answer = new String[count];
        for(int i=0;i<count;i++){
            char[] str = br.readLine().toCharArray();
            for(int j=0;j<str.length/2;j++){
                char temp = str[j];
                str[j] = str[str.length-j-1];
                str[str.length-j-1] = temp;
                answer[i] = String.valueOf(str);
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(answer[i]);
        }

    }
}
