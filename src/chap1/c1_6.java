package chap1;

import java.util.Scanner;

public class c1_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        char[] chars2 = new char[26];
        StringBuilder answer =new StringBuilder();

        for(Character c : chars){
            if(chars2[c-'a']=='\u0000'){
                chars2[c-'a']=c;
                answer.append(c);
            }
        }
        System.out.print(answer.toString());
    }
}


/*
6. 중복문자제거
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