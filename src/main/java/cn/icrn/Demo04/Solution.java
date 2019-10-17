package cn.icrn.Demo04;

/**/
/**
 * Created by yan on 2016/10/8.
 * 04.替换空格
 请实现一个函数，将一个字符串中的空
 格替换成“%20”。例如，当字符串为We Are Happy.
 则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Solution {
    public String replaceSpace(StringBuffer str) {
       int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        int l = str.length()-1;
        char[] ch = new char[str.length()+count*2];
        for(int i=ch.length-1;i>=0;i--){
            if(str.charAt(l)==' '){
                ch[i--]='0';
                ch[i--]='2';
                ch[i]='%';
            }else
                ch[i] = str.charAt(l);
            l--;
        }
        return String.valueOf(ch);
}
}