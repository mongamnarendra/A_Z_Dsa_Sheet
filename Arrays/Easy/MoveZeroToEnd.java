package Arrays.Easy;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void move(int[] nums)
    {
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]!=0){
                i++;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={1,0,3,0,4,5};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}
