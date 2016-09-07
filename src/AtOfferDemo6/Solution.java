import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
    	int index1 = 0;
        int index2 = array.length-1;
        int mid = 0;
        while(array[index1]>=array[index2]){
            if(index2-index1==1)
                return array[index2];
            mid = (index1+index2)/2;
            if(array[index1]<=array[mid])
                index1 = mid;
            else if(array[index2]>=array[mid])
                index2 = mid;
        }
        return array[mid];
    }
}