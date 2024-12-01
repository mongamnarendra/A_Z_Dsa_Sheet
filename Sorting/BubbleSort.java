package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
