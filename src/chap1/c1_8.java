package chap1;

import java.util.Scanner;

public class c1_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String answer ="YES";
        int lt=0;
        int rt = str.length()-1;
        char[] chars = str.toCharArray();
        while(lt<rt){
            if(!Character.isAlphabetic(chars[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(chars[rt])){
                rt--;
            }
            else if(!(chars[lt] == chars[rt])){
                answer="NO";
                break;
            }
            else {
                lt++;
                rt--;
            }
        }
        System.out.print(answer);
    }
}


/*
8. 유효한 팰린드롬
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력

첫 줄에 길이 100을 넘지 않는 공백이 있는 문자열이 주어집니다.


출력

첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1

found7, time: study; Yduts; emit, 7Dnuof
예시 출력 1

YES
 */