package cn.icrn.Demo35;

/**
 * Created by yan on 2016/10/8.
 * 35.第一个只出现一次的字符

 */

import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
            return -1;
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i]))
                map.put(chars[i],map.get(chars[i])+1);
            else
                map.put(chars[i], 1);
        }
        int index=-1;
        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i])==1){
                index = i;
                break;
            }
        }
        return index;
    }
}
