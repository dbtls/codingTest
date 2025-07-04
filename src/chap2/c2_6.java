package chap2;

import java.util.Scanner;

public class c2_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nums[] = new int[num];
        for(int i=0;i<num;i++){
            int nb = sc.nextInt();
            while(nb>0){ //숫자 뒤집기
                nums[i]=nums[i]*10+nb%10;
                nb/=10;
            }
        }
        int max=nums[0];
        for(int i=1;i*i<max;i++){
            if(max<nums[i])
                max=nums[i];
        }
        max++;
        boolean[] isPrime=new boolean[max];
        isPrime[0]=true;
        isPrime[1]=true;
        for(int j=2;j<max;j++){ //에라토스테네스의 체
            if(isPrime[j]==false){
                for(int z=j*2;z<max;z+=j){
                    isPrime[z]=true;
                }
            }
        }
        for(int i=0;i<num;i++){
            if(!isPrime[nums[i]]){
                System.out.print(nums[i]+" ");
            }
        }
    }
}


/*6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력

첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력

첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1

9
32 55 62 20 250 370 200 30 100
예시 출력 1

23 2 73 2 3
 */