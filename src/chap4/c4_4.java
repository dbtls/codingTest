package chap4;

/*
문제 ID: 04-04
제목: 4. 모든 아나그램 찾기

설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

예시 입력 1
bacaAacba
abc

예시 출력 1
3
*/
import java.io.*;
import java.util.*;
public class c4_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();

        int n = arr1.length;
        int k = arr2.length;


        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0;i<k;i++){
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
            map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
        }
        int answer = 0;
        if(map1.equals(map2)){
            answer++;
        }

        for(int i=1;i<n-k+1;i++){
            map1.put(arr1[i+k-1],map1.getOrDefault(arr1[i+k-1],0)+1);
            map1.put(arr1[i-1],map1.getOrDefault(arr1[i-1],0)-1);
            if(map1.get(arr1[i-1]) ==0){
                map1.remove(arr1[i-1]);
            }
            if(map1.equals(map2)){
                answer++;
            }
        }
        System.out.println(answer);


    }
}
