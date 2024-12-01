package Sorting;

import java.util.Arrays;

public class QuickSort {
    private static int getPivortIndex(int[] arr,int low,int high)
    {

        int pivort=arr[low];
        int i=low;
        int j=high;

        while(i<j)
        {
            //getting larger element then the pivort
            while(arr[i]<=pivort && i<=high-1)
            {
                i++;
            }

            //getting index of smaller element then pivort
            while(arr[j]>pivort && j>=low+1)
            {
                j--;
            }

            //swapping both i and j
            if(i<j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swapping pivort and j because j crossed i (i<j)
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    public static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)               //base condition
        {
            int pivortIndex=getPivortIndex(arr,low,high);            //calling method to get correct index of the pivort\

            quickSort(arr,low,pivortIndex-1);                  //recursion for left of the pivort

            quickSort(arr,pivortIndex+1,high);                  //recursion for right of the pivort
        }
    }
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};

        //calling quickSort method
        quickSort(a,0,a.length-1);
        //printing array after sorting
        System.out.println(Arrays.toString(a));
    }
}
