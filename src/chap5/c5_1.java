package chap5;

import java.util.Scanner;
import java.util.Stack;

public class c5_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        boolean isTrue=true;
        char[] chs = s1.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s1.length();i++){
            if (chs[i] == '(') {
                stack.push('(');
            } else if (chs[i] == ')' && !stack.isEmpty() && stack.pop() == '(') {
            } else {
                isTrue = false;
                break;
            }
        }
        if(stack.empty()&&isTrue){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

/*
1. 올바른 괄호
설명

괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


입력

첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.


출력

첫 번째 줄에 YES, NO를 출력한다.


예시 입력 1

(()(()))(()
예시 출력 1
NO
 */