package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] a)
    {
        for(int i =0;i<a.length;i++)
        {
            int min=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
