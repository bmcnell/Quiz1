package pkgMain;

import java.util.Scanner;

public class cMain {
	public static double main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of passing attempts: ");
		double ATTr = input.nextDouble();
		System.out.println("Enter number of completions:  ");
		double COMPr = input.nextDouble();
		System.out.println("Enter number of passing yards: ");
		double YDSr = input.nextDouble();
		System.out.println("Enter number of touchdown passes: " );
		double TDr = input.nextDouble();
		System.out.println("Enter number of interceptions: ");
		double INTr = input.nextDouble();
		
		double ATT = ATTr;
		double COMP = COMPr;
		double YDS = YDSr;
		double TD = TDr;
		double INT = INTr;
		double a = (((COMP/ATT) - 0.3) * 5);
		double b = (((YDS/ATT) - 3) * .25);
		double c = ((TD/ATT) * 20);
		double d = (2.375 - ((INT/ATT) * 25));
		
		return (a+b+c+d)/6 * 100;
}
}
