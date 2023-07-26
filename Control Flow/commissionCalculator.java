import java.util.Scanner;
public class commissionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cual es tu rango salarial: ");
		int total = in.nextInt();
		double comision = 0;
		if ( total >= 10000) {
			comision = (total * 0.30);
		} else if (total >= 5001 && total <= 9999) {
			comision = (total * 0.20);
		} else if (total >= 1001 && total <= 4999) {
			comision = (total * 0.10);
		} else {
			System.out.println("No hay comisión");
		} // if else}
		System.out.println("Tu comisión es: " + comision);
		in.close();
	} // main

} // class IfElseDemo
