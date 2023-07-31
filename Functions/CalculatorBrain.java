
public class CalculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = suma(15, 75);
		System.out.println(c);
		c = multi(5, 7);
		System.out.println(c);
		c = divicion(15, 7);
		System.out.println(c);
		c = resta(9, 7);
		System.out.println(c);
	
	}
	
	public static int suma (int a, int b) {
		return (a + b );
	} //suma

	public static int multi (int a, int b) {
		return (a * b );
	} //multi
	
	public static int divicion (int a, int b) {
		return (a / b );
	} //divicion
	
	public static int resta (int a, int b) {
		return (a - b );
	} //resta
}
