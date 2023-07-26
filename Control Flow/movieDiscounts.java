import java.util.Scanner;
public class movieDiscounts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cual es tu edad: ");
		int edad = in.nextInt();
		float total = 7;
		if ( edad < 5) {
			total = (float) (total * 0.60);
		} else if ( edad > 60) {
			total = (float) (total * 0.55);
		} else {
			System.out.println("Lo sentimos no hay descuento");
		} // if else}
		System.out.println("Tu boleto cuesta: " + total);
		in.close();
	} // main

} // class IfElseDemo
