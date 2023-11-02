import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.io.InputStreamReader;
public  class Sample23 {
    public static void main(String[] args) throws Exception {
        int[][] test;
        test = new int [2][5];

        test[0][0]=19;
        test[0][1]=89;
        test[0][2]=06;
        test[0][3]=04;
        test[0][4]=19;
        test[1][0]=37;
        test[1][1]=12;
        test[1][2]=13;
        test[1][3]=00;

        

        for (int i = 0; i<test[1].length;i++)
        {
        System.out.println("第" + (i+1) + "個人的國文分數是" + test[0][i]+ "分");
        System.out.println("第" + (i+1) + "個人的數學分數是" + test[1][i]+ "分");
        }
        
    }
} 

