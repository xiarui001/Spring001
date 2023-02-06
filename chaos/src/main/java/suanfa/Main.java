package suanfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextFloat();
        StringBuffer buffer = new StringBuffer();
        int i = 1;
        Math.sqrt(i);
    }

    void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    void sort(int nums[],int start, int end){
        if(start>=end){return;}
        int mid = partion(nums,start,end);
        sort(nums,start,mid-1);
        sort(nums,mid+1,end);
    }

    int partion(int[] nums, int start, int end){
        int left = start;
        int right = end;

        if(left >= right)
            return left;
        while(left<right){
            while (left<right&&(nums[right]>=nums[start]))
                right--;
            while (left<right&&(nums[left]<=nums[start]))
                left++;
            swap(nums, right,left);
        }
        swap(nums,start,left);
        return left;
    }
}
