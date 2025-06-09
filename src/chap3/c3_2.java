package chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class c3_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] nums1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            nums1[i] = kb.nextInt();
        }
        Arrays.sort(nums1);
        int num2 = kb.nextInt();
        int[] nums2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            nums2[i] = kb.nextInt();
        }
        Arrays.sort(nums2);
        ArrayList answer = new ArrayList();
        int p1 = 0, p2 = 0;
        while(p1<num1&&p2<num2) {
            if (nums1[p1] > nums2[p2])
                p2++;
            else if (nums2[p2] > nums1[p1])
                p1++;
            else {
                answer.add(nums1[p1++]);
                p2++;
            }
        }
        for(Object a : answer){
            System.out.print(a+" ");
        }

    }
}



/*
2. 공통원소 구하기
설명

A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


입력

첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

각 집합의 원소는 1,000,000,000이하의 자연수입니다.


출력

두 집합의 공통원소를 오름차순 정렬하여 출력합니다.


예시 입력 1

5
1 3 9 5 2
5
3 2 5 7 8
예시 출력 1

2 3 5
 */