package chap3;
import java.util.Scanner;
public class c3_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] nums1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            nums1[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] nums2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            nums2[i] = kb.nextInt();
        }
        int[] answer = new int[num1 + num2];

        int p1 = 0, p2 = 0, count = 0;
        while (p1 < num1 && p2 < num2) {
            if (nums1[p1] > nums2[p2]) {
                answer[count++] = nums2[p2++];
            } else if (nums1[p1] <= nums2[p2]) {
                answer[count++] = nums1[p1++];

            }
        }
        for (int i = p2; i < num2; i++) {
            answer[count++] = nums2[i];
        }

        for (int i = p1; i < num1; i++) {
            answer[count++] = nums1[i];
        }

        for (int a : answer) {
            System.out.print(a + " ");
        }

    }
}



/*
1. 두 배열 합치기
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력

첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력

오름차순으로 정렬된 배열을 출력합니다.


예시 입력 1

3
1 3 5
5
2 3 6 7 9
예시 출력 1

1 2 3 3 5
 */
