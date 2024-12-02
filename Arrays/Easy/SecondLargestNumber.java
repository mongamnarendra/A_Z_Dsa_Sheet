package Arrays.Easy;

import java.util.Arrays;

public class SecondLargestNumber {

    private static int getSecondMaxOptimized(int[] a)
    {
        int max=a[0];
        int prev=-1;
        for(int i:a)
        {
            if(i>max)
            {
                prev=max;
                max=i;
            }
            if(i!=max && prev<i)
            {
                prev=i;
            }
        }

        return prev;
    }

    private static int getSecondMaxBruteForce(int[] a)
    {
        Arrays.sort(a);
        int secondMax=-1;
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]!=a[a.length-1])
            {
                secondMax=a[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] a={5,10,10};
        int maxElement= getSecondMaxOptimized(a);
        int max=getSecondMaxBruteForce(a);
        System.out.println(maxElement);
        System.out.println(max);
    }
}
