package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArray {
    public static void union(int[] num1,int[] num2) {
        HashSet<Integer> al = new HashSet<>();
        for(int i:num1)al.add(i);
        for(int i:num2)al.add(i);
        ArrayList<Integer> he = new ArrayList<>();
        for(int i:al) he.add(i);

        System.out.println(he);
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int[] num2={1,2,3,6,7};
        union(num1,num2);
    }
}
