package chap6;

import java.util.Scanner;
import java.util.Arrays;

public class c6_1 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = kb.nextInt();
        }
        Arrays.sort(nums);
        for(int a : nums){
            System.out.print(a+" ");
        }
    }
}
