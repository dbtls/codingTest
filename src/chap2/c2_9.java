package chap2;

import java.util.Scanner;

public class c2_9 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] nums = new int[num];

        for(int i=0;i<num;i++){
            nums[i]=kb.nextInt();
        }
        int[] answer = new int[num];
        for(int i=0;i<num;i++){
            int rank=1;
            for(int j=0;j<num;j++){
                if(nums[i]<nums[j]){
                    rank++;
                }
            }
            answer[i]=rank;
            System.out.print(rank+" ");
        }

    }
}

/*  처음에 생각한 더러운 방법. 숫자 - 인덱스 번호의 2차원 배열을 설정하고 숫자 기준 정렬 후, 정렬된 숫자의 인덱스 번호를 기준으로
rank 배열을 채워넣음 rank[indexNum] = rank (rank는 1부터 시작해서 실제 등수값을 넣어줌) 물론 넣을 때 전 값과 동일하면 rank는
늘어나지 않다가 달라지면 한번에 늘어남. 
public class c2_8 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] answer = new int[num][2];

        for(int i=0;i<num;i++){
            answer[i][0]=kb.nextInt();
            answer[i][1]=i;
        }
        Arrays.sort(answer,(o1, o2) ->{
            return o2[0] - o1[0];
        });
        int currentRank = 1;
        int[] rank=new int[num];
        for(int i=0;i<num;i++){
            if (i == 0 || answer[i][0] != answer[i - 1][0]) {
                currentRank = i + 1;
            }
            rank[answer[i][1]]=currentRank;
        }
        for(int a : rank){
            System.out.print(a+" ");
        }

    }
}*/


/*
8. 등수구하기
설명

N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.

같은 점수가 입력될 경우 높은 등수로 동일 처리한다.

즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.


입력

첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.


출력

입력된 순서대로 등수를 출력한다.


예시 입력 1

5
87 89 92 100 76
예시 출력 1

4 3 2 1 5
 */