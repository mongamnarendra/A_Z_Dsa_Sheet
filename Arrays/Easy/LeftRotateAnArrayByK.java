package Arrays.Easy;

import java.util.Arrays;

public class LeftRotateAnArrayByK {

    public static void rotate(int[] nums,int k)
    {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);

    }

    private static void reverse(int[] nums,int left,int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
