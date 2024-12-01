package Arrays.Easy;

public class LargestNumberInArray {

    private static int getMax(int[] a)
    {
        int max=a[0];
        for(int i:a)
        {
            if(i>max)
            {
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={1, 8, 7, 56, 90};
        int maxElement= getMax(a);
        System.out.println(maxElement);
    }
}
