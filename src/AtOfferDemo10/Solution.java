public class Solution {
    public int RectCover(int target) {
		if(target<=0)
            return 0;
        int res[] = new int[target+1];
        res[0] =1;
        res[1] =1;
        for(int i=2;i<=target;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res[target];
    }
}