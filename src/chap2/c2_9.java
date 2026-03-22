package chap2;

/*
문제 ID: 02-09
제목: 9. 격자판 최대합
이미지 포함 문제

설명
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
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
import java.io.*;
import java.util.*;
public class c2_9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        int[] n3 = new int[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer ( br.readLine());
            for(int j=0;j<n;j++){
                int n4 = Integer.parseInt(st.nextToken());
                n1[i]+=n4;
                n2[j]+=n4;
                if(i==j){
                    n3[0]+=n4;
                }
                else if(j+i==n-1){
                    n3[1]+=n4;
                }
            }
        }
        int answer=0;
        for(int i=0;i<n;i++){
            if(answer<n1[i]){
                answer=n1[i];
            }
            if(answer<n2[i]){
                answer=n2[i];
            }
            if(i<2&&answer<n3[i]){
                answer=n3[i];
            }
        }
        System.out.println(answer);


    }
}
