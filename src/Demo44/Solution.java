package Demo44;

/**
 * Created by yan on 2016/10/8.
 * 44.ÆË¿ËÅÆË³×Ó
 */
import java.util.Arrays;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5)
            return false;
        Arrays.sort(numbers);
        int zoo = 0;
        for(int i=0;i<5;i++){
            if(numbers[i]==0)
                zoo++;
        }
        int disk = 0;
        for(int i=zoo;i<4;i++){
            if(numbers[i+1]-numbers[i]!=1)
                disk += numbers[i+1]-numbers[i]-1;
            if(numbers[i+1]-numbers[i]==0)
                return false;
        }
        if(disk<=zoo)
            return true;
        return false;
    }
}
