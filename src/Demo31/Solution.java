package Demo31;

/**
 * Created by yan on 2016/10/8.
 * 31.连续子数组的最大和
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0)
            return 0;
        int max=array[0];
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(sum<=0)
                sum=array[i];
            else
                sum+=array[i];
            if(sum>max)
                max = sum;
        }
        return max;
    }
}
