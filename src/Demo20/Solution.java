package Demo20;

/**
 * Created by yan on 2016/10/8.
 * 20.˳ʱ���ӡ����
 * ����һ�����󣬰��մ���������˳ʱ���
 * ˳�����δ�ӡ��ÿһ�����֣����磬���
 * �������¾��� 1 2 3 4 5 6 7 8 9 10
 * 11 12 13 14 15 16 �����δ�ӡ������
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) { int rows=matrix.length;
        int columns=matrix[0].length;
        if(rows==0||columns==0){return null;}
        int start=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(columns>2*start&&rows>2*start){
            print(a,rows,columns,start,matrix);
            start++;
        }
        return a;

    }
    public void print(ArrayList<Integer>a,int rows,int columns,int start,int [][]matrix){
        int endX=rows-1-start;
        int endY=columns-1-start;
        for(int i=start;i<=endY;i++){
            a.add(matrix[start][i]);
        }
        if(endX>start){
            for(int i=start+1;i<=endX;i++){
                a.add(matrix[i][endY]);
            }
        }
        if(endY>start&&endX>start){
            for(int i=endY-1;i>=start;i--){
                a.add(matrix[endX][i]);
            }
        }
        if(endY>start&&endX>start+1){
            for(int i=endX-1;i>=start+1;i--){
                a.add(matrix[i][start]);
            }
        }
    }
}

