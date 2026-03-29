package chap3;

/*
문제 ID: 03-02
제목: 2. 공통원소 구하기

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
import java.io.*;
import java.util.*;
public class c3_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());


        int[] arr1= new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        int m=Integer.parseInt(br.readLine());
        int[] arr2= new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){

            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2);
        int p1=0;
        int p2=0;
        ArrayList<Integer> answer = new ArrayList<>();
        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]){
                p1++;
            }
            else if(arr1[p1]>arr2[p2]){
                p2++;
            }
            else{
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        for(int a : answer){
            System.out.print(a+" ");
        }
    }
}
