package Exam_12708_20161209_2.Exam_12708_20161209_2;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("请输入工资：");
		String str=s.next();
		double salary =Double.parseDouble(str);
		double c=salary-3500;
		double tax=0;
		if (c <= 0) {
			tax=0;
		} else if(c <= 1500) {
			tax=c*0.03;
		}else if(c <= 4500) {
			tax=c*0.1;
		}else if(c <= 9000) {
			tax=c*0.2;
		}else if(c <= 35000) {
			tax=c*0.25;
		}else if(c <= 55000) {
			tax=c*0.3;
		}else if(c <= 80000) {
			tax=c*0.35;
		}else  {
			tax=c*0.45;
		}
		System.out.println("所需要缴纳的税费为："+tax);
	}
}
