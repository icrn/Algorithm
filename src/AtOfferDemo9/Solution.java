public class Solution {
    public int JumpFloorII(int target) {
        if(target<=0)
            return 0;
        int res[] = new int[target+1];
        res[0]=1;
        res[1]=1;
        for(int i=2;i<=target;i++){
            res[i]=0;
            for(int j=0;j<i;j++){
                res[i]+=res[j];
            }
        }
        return res[target];
    }
}