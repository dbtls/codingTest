package chap1;

/*
문제 ID: 01-06
제목: 6. 중복문자제거

설명
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

예시 입력 1
ksekkset

예시 출력 1
kset
*/
/* boolean 배열 방식 ( 처음 한 방식)
import java.io.*;
import java.util.*;

public class c1_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isUsed = new boolean[26];
        for(int i=0; i<26;i++){
            isUsed[i]=false;
        }
        String str = br.readLine();
        String answer="";
        for(int i=0;i<str.length();i++){
            if(!isUsed[str.charAt(i)-'a']){
                isUsed[str.charAt(i)-'a']=true;
                answer+=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
*/
/*
hashset방식 (좀더 보편적이라고 함)
 */
import java.io.*;
import java.util.*;

public class c1_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();
        String answer="";
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                answer+=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
