public class Solution {
    public int JumpFloor(int target) {
		int result=0;
        int prenum=2;
        int preprenum=1;
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        for(int i=3;i<=target;i++){
            result = prenum+preprenum;
            preprenum=prenum;
            prenum=result;
        }
        return result;
    }
}