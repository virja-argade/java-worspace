package DissionmakingStetement;

import java.util.Scanner;

public class ifelseladder {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks = sc.nextInt();
		
		if (marks > 100) {
			System.out.println("invalid input");
		} else if (marks>=80) {
			System.out.println("A grade");
		}else if (marks>=60) {
			System.out.println("B grade");
		}else if (marks>=40) {
			System.out.println("c grade");
		}else {
			System.out.println("you are not eligible to taking admission in next class");
			
			
		}
		
		
	}

}
