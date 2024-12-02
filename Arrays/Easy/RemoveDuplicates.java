package Arrays.Easy;

public class RemoveDuplicates {
    private static int removeDuplicates(int[] arr,int n) {
        int i=0;
        int j=i+1;
        while(j<n)
        {
            if(arr[i]!=arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i=i+1;
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,5,5,5};
        System.out.println(removeDuplicates(nums, nums.length));
    }
}
