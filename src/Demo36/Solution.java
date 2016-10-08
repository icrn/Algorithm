package Demo36;

/**
 * Created by yan on 2016/10/8.
 * 36.数组中的逆序对
 *
 */

public class Solution {
    int count = 0;
    public void merge(int[] array, int start, int mid, int end){
        int firstFlag = mid;//第一段位置标记
        int secondFlag = end;//第二段位置标记
        int[] temp = new int [end - start +1];
        //从后向前合并
        int flag = end - start;
        while(firstFlag >= start && secondFlag >= mid+1){
            if( array[firstFlag] > array[secondFlag]){
                count = (count + secondFlag - mid)%1000000007;
                temp[flag] = array[firstFlag];
                firstFlag --;
                flag --;
            }else{
                temp[ flag ] = array[secondFlag];
                secondFlag--;
                flag --;
            }
        }

        //copy未扫描的第一段
        while( firstFlag >= start ){
            temp[flag] = array[firstFlag];
            firstFlag --;
            flag --;
        }

        //扫描第二段
        while( secondFlag >= mid+1){
            temp[ flag ] = array[secondFlag];
            secondFlag--;
            flag --;
        }

        for(int i = start; i <= end; i++){
            array[i] = temp[i-start];
        }
    }
    public void mergePass(int[] array, int gap){
        int i = 0;
        for(i = 0; i+gap*2-1 < array.length; i = i + gap*2){
            merge(array, i, i+gap-1, i+gap*2-1);
        }
        if( i+gap-1 < array.length )
            merge(array, i, i+gap-1, array.length-1);
    }
    public int InversePairs(int[] array) {
        count = 0;
        for(int gap = 1; gap < array.length; gap *= 2)
            mergePass(array, gap);
        return count;
    }
}
