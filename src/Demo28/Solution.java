package Demo28;

/**
 * Created by yan on 2016/10/8.
 * 28.字符串的排列
 * 输入一个字符串,按字典序打印出
 * 该字符串中字符的所有排列。例如
 * 输入字符串abc,则打印出由字符a,b,c
 * 所能排列出来的所有字符串abc,acb,
 * bac,bca,cab和cba。 结果请按字母顺序输出。
 */
import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if(str == null || str.length() == 0){
            return list;
        }
        char[] carr = str.toCharArray();
        //Arrays.sort(carr);
        permutation(carr, 0, list);
        Collections.sort(list);
        return list;
    }

    public void permutation(char[] carr, int index, ArrayList<String> list){

        if(index == carr.length){
            if(!list.contains(String.valueOf(carr))){
                list.add(String.valueOf(carr));
            }
        }else {
            for(int i = index;i < carr.length;i++){

                char tmp = carr[i];
                carr[i] = carr[index];
                carr[index] = tmp;

                permutation(carr, index + 1, list);

                tmp = carr[i];
                carr[i] = carr[index];
                carr[index] = tmp;
            }
        }
    }
}
