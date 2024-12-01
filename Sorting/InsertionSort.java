package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
