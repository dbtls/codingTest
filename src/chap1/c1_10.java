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
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        char target = st.nextToken().charAt(0);

        int[] answer = new int[s1.length()];
        int distance = 1000;

        // 왼쪽에 있는 target과의 거리
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == target) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = distance;
        }

        distance = 1000;

        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i) == target) distance=0;
            else distance++;
            if(answer[i]>distance) answer[i]=distance;

        }
        for(int i :answer){
            System.out.print(i+" ");
        }
    }
}
