package chap3;

/*
문제 ID: 03-01
제목: 1. 두 배열 합치기

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
1 2 3 3 5 6 7 9
*/
import java.io.*;
import java.util.*;

public class c3_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=Integer.parseInt(st2.nextToken());
        }
        int[] answer = new int[n1+n2];
        int p1=0;
        int p2=0;
        int count=0;
        while(p1<n1&&p2<n2){
            if(arr1[p1]<=arr2[p2]){
                answer[count] = arr1[p1];
                p1++;
                count++;
            }
            else{
                answer[count]= arr2[p2];
                p2++;
                count++;
            }
        }
        if(p1==n1){
            for(int i=p2;i<n2;i++){
                answer[count]=arr2[i];
                count++;
            }
        }
        else{
            for(int i=p1;i<n1;i++){
                answer[count]=arr1[i];
                count++;
            }
        }


        for(int n : answer){
            System.out.print(n+" ");
        }


    }
}

/*
import java.io.*;
import java.util.*;

public class c3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        int[] answer = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            answer[i] = arr1[i];
        }
        for (int i = n1; i < n2 + n1; i++) {
            answer[i] = arr2[i - n1];
        }
        Arrays.sort(answer);
        for (int n : answer) {
            System.out.print(n + " ");
        }
    }
}*/
