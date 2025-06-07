package conditionalstatements;

import java.util.Scanner;

public class Marksheet {
	
	public static void main(String[] args) {
		int Math, Science, English;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of Math - ");
		Math = sc.nextInt();
		
		System.out.println("Enter marks of Science - ");
		Science = sc.nextInt();
		
		System.out.println("Enter marks of English - ");
		English = sc.nextInt();
		
		
		avg = (Math + Science + English) / 3f;
		System.out.println("Avg - " + avg);
		
		
		if(avg >= 90 && avg <= 100) {
			System.out.println("Grade - A+");
			System.out.println("Excellent performance!");
		} else if (avg >= 75 && avg <= 89) {
			System.out.println("Grade - A");
			System.out.println("Excellent performance!");
		} else if (avg >= 60 && avg <= 74) {
			System.out.println("Grade - B");
			System.out.println("Keep improving.");	
		} else if (avg >= 40 && avg <= 59) {
			System.out.println("Grade - C");
			System.out.println("Keep improving.");
		}else if (avg < 40) {
			System.out.println("Fail. Please work harder next time.");
		}
		
		
		
		
		if (Math < 35 || Science < 35 || English < 35) {
			System.out.println("Failed due to low score in at least one subject.");
		}
		
	}

}
