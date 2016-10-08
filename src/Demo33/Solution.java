package Demo33;

/**
 * Created by yan on 2016/10/8.
 * 33.把数组排成最小的数
 输入一个正整数数组，把数组里所有数
 字拼接起来排成一个数，打印能拼接出
 的所有数字中最小的一个。例如输入数组
 {3，32，321}，则打印出这三个数字能排
 成的最小数字为321323。
 */
import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        ArrayList list = new ArrayList();
        for(int i = 0;i<numbers.length;i++){
            list.add(Integer.toString(numbers[i]));
        }
        Collections.sort(list,new Compare());
        StringBuffer sb = new StringBuffer();
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            sb.append(it.next());
        }
        return sb.toString();
    }

    class Compare implements Comparator<String>{
        public int compare(String o1, String o2) {
            String s1 = o1+o2;
            String s2 = o2+o1;
            return s1.compareTo(s2);
        }
    }
}
