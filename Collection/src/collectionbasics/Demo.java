package collectionbasics;

import java.util.ArrayList;

public class Demo {
	public static void main(String[]args) {
		student stu1=new student();
		stu1.setSid(111);
		stu1.setSname("pravil");
		stu1.setSadd("pune");
		stu1.setScity("pimprichinchvad");
		
		student stu2 = new student();
		stu2.setSid(112);
		stu2.setSname("pratik");
		stu2.setSadd("tembhurni");
		stu2.setScity("barvemala");
		
		student stu3 = new student();
		stu3.setSid(113);
		stu3.setSname("virija");
		stu3.setSadd("akluj");
		stu3.setScity("sangramnagar");
		
		student stu4 = new student();
		stu4.setSid(114);
		stu4.setSname("shivtej");
		stu4.setSadd("miraj");
		stu4.setScity("miraj");
		
		ArrayList al =new ArrayList();
		al.add(stu1);
		al.add(stu2);
		al.add(stu3);
		al.add(stu4);
		
		System.out.println(al);
				
		
	}
}



