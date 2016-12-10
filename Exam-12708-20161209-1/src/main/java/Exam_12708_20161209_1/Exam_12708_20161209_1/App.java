package Exam_12708_20161209_1.Exam_12708_20161209_1;

import java.util.Vector;

public class App {

	public static void main( String[] args ){
		int count=0;
		Vector v=new Vector();

		for (int i = 101; i <= 200; i++) {
			boolean b=true;			
			for (int j = 2; j < i ; j++) {
				if (i%j == 0) {
					b=false;
					break;
				}
			}	
			if (b) {
				count++;
				v.add(i);
			}			
		}
		System.out.println("101-200间总共有 "+count+" 个素数,分别是："+v);
	}
}