package Demo38;

/**
 * Created by yan on 2016/10/8.
 * 38.���������������г��ֵĴ���

 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int sum=0;
        int n=array.length;
        for(int i=0 ; i<n ; i++){
            if(array[i]==k)sum++;
            else if(array[i]>k)break;
        }
        return sum;
    }
}
