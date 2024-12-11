package Arrays.Easy;


import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithKsum {
    public static int lenOfLongestSubarr(int[] a, int k) {
        Map<Integer,Integer> hm= new HashMap<>();

        int max=0;
        int i=0;
        int sum=0;
        while(i<a.length) {

            sum+=a[i];

            if(sum==k) {
                max=Math.max(max,i+1);
            }

            int rem= sum-k;

            if(hm.containsKey(rem)) {
                int len = i-hm.get(rem);
                max=Math.max(max,i+1);
            }

            if(!hm.containsKey(rem)) {

                hm.put(rem,i);
            }

            i++;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] a={ 10,5,2,7,1,9};
        int k=15;
        System.out.println(lenOfLongestSubarr(a,k));
    }
}
