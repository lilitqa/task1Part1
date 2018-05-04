package mentoringTask1Part1;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args){		
		
		System.out.print("Please, enter a number then an operator +,-,*,/");
		Scanner sc = new Scanner(System.in);
		Calculator calc =  new Calculator();
		    try {
				while (true) {
				System.out.println();
				calc.setValue1(sc.nextDouble());
				calc.setOperator(sc.next().charAt(0));
				calc.setValue2(sc.nextDouble());
				calc.calculate();			 
				}
			} catch (Exception ex) {
				System.out.println("Incorrect value.");
			}
		sc.close();
		
	}

}
