package Arrays.Easy;

public class LeetCode1752 {
    public static boolean check(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[(i+1)%nums.length];
            if( n < nums[i])
            {
                count++;
            }
            if(count>1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={5,1,2,3,4};
        System.out.println(check(a));
    }
}
