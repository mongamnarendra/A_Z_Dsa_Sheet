package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] a,int low,int high)
    {

        if(low>=high) return;            //base condition

        int mid=(low+high)/2;            //calculating mid vallue

        mergeSort(a,low,mid);           //for left halve

        mergeSort(a,mid+1,high);           //for righht halve

        merge(a,low,mid,high);                //after dividing merging two halves after sorting
    }

    public static void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int left = low;
        int right=mid+1;

        //comparing two halve elements by using two pointer
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                al.add(arr[left++]);
            }
            else {
                al.add(arr[right++]);
            }
        }

        //if still there are any elements in left halve , because if right halve length is less than left then right<=high returns falses so still left halve have elemenst
        while(left<=mid)
        {
            al.add(arr[left++]);
        }

        // same as left halve in above
        while(right<=high)
        {
            al.add(arr[right++]);
        }


        //transferring elements to array
        for(int i=low;i<=high;i++)
        {
            arr[i]=al.get(i-low);
        }
    }
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};

        //calling mergesort method
        mergeSort(a,0,a.length-1);
        //printing array after sorting
        System.out.println(Arrays.toString(a));
    }
}
