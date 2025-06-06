package chap1;

import java.util.Scanner;

public class c1_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int[] answer = new int[str.length()];
        char[] chars = str.toCharArray();
        int count=101;
        for(int i=0;i<str.length();i++){
            if(chars[i]==ch){
                count=0;
            }
            else
                count++;
            answer[i]=count;
        }
        count=0;
        boolean isSeedE = false;
        for(int i=str.length()-1;i>=0;i--){
            if(chars[i]==ch)
                isSeedE = true;
            if(isSeedE==true){
                if(chars[i]==ch){
                    count=0;
                }
                else
                    count++;
                if(answer[i]>count)
                    answer[i]=count;
            }
        }
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
}


/*
10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력

첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력

첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0
 */