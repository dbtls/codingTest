package chap1;

/*
문제 ID: 01-10
제목: 10. 가장 짧은 문자거리

설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에  문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

예시 입력 1
teachermode e

예시 출력 1
1 0 1 2 1 0 1 2 2 1 0
*/
/*
시작값을 1이아니라 크게 잡아야함. 안그럼 앞의 값들이 작게 나올 수 있음.
 */
import java.io.*;
import java.util.*;
public class c1_10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str=st.nextToken();
        char ch = st.nextToken().charAt(0);
        int count=1000;
        int[] answer =new int[str.length()];
        for(int i=0;i<answer.length;i++){
            if(str.charAt(i)==ch) count=0;
            answer[i]=count;
            count++;
        }
        count=1000;
        for(int i=answer.length-1;i>=0;i--){
            if(str.charAt(i)==ch) count=0;
            if(answer[i]>count) {
                answer[i] = count;
            }
            count++;

        }
        for(int c : answer){
            System.out.print(c+" ");
        }
    }
}
