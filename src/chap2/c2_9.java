package chap2;

import java.util.Scanner;

public class c2_9 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] nums = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                nums[i][j] = kb.nextInt();

            }
        }
        int maxX=0;
        int max=0;
        int[] addY=new int[num];
        int[] addCross = new int[2];
        for(int i=0;i<num;i++){
            int addX=0;
            for(int j=0;j<num;j++){
                addX+=nums[i][j];
                addY[j]+=nums[i][j];
                if(i==j){
                    addCross[0]+=nums[i][j];
                }
                if(i+j==num-1){
                    addCross[1]+=nums[i][j];
                }
            }
            if(maxX<addX){
                maxX=addX;
            }
        }
        max = maxX>addCross[0]?maxX :addCross[0];
        max = max>addCross[1]?max : addCross[1];
        for(int i=0;i<num;i++){
            if(max<addY[i])
                max=addY[i];
        }
        System.out.println(max);
    }
}




/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력

첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력

최대합을 출력합니다.


예시 입력 1

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
예시 출력 1

155
 */