package chap4;

import java.util.Scanner;
import java.util.TreeSet;

public class c4_5 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] nums= new int[n];
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i=0;i<n;i++){
            nums[i]=kb.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int z=j+1;z<n;z++){
                    tree.add(nums[i]+nums[j]+nums[z]);
                }
            }
        }
        int cnt=0;
        for(int i : tree){
            cnt++;
            if(cnt==tree.size()-k+1){
                System.out.println(i);
                break;
            }

        }
        if(cnt>tree.size()-k+1){
            System.out.println(-1);
        }


        /*Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int[] nums = new int[n1];
        int[] sum = new int[n1-n2+1];
        for(int i=0;i<n1;i++){
            nums[i]=kb.nextInt();
        }

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                for(int z=j+1;z<n1;z++){
                    set.add(nums[i]+nums[j]+nums[z]);
                }
            }
        }
        int cnt = 0;
        for(int answer : set){
            cnt++;
            if(cnt == n2){
                System.out.println(answer);
                return;
            }
        }*/
    }
}

/*
5. K번째 큰 수
설명  

현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.

현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.

기록한 값 중 K번째로 큰 수
를 출력하는 프로그램을 작성하세요.
\
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.


입력

첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.


출력

첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.


예시 입력 1

10 3
13 15 34 23 45 65 33 11 26 42
예시 출력 1

143

 */