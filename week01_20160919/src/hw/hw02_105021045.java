package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021045 郭毓呈
 */

import java.util.Random;
import java.util.Scanner;
public class hw02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		Scanner scn=new Scanner(System.in);
		System.out.print("n=");
	int n =scn.nextInt();
	   int v1 =rnd.nextInt(n)+1;
	   System.out.println("第一個數字="+v1);
	   int v2 =rnd.nextInt(n)+1;
	   System.out.println("第二個數字="+v2);
	   int v3 =rnd.nextInt(n)+1;
	   System.out.println("第三個數字="+v3);
	   int v4 =rnd.nextInt(n)+1;
	   System.out.println("第四個數字="+v4);
	   int v5 =rnd.nextInt(n)+1;
	   System.out.println("第五個數字="+v5);
	   int v6 =rnd.nextInt(n)+1;
	   System.out.println("第六個數字="+v6);

	}

}
