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