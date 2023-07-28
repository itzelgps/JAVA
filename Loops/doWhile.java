import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num = 0;
        int num2 = 1;
        int total = num * num2;
        
        total = console.nextInt();
        
        do {        	
        	System.out.println("La tabla de Fibonacci " + total);
		total*=num2;
		}while(total <= 13);

	}

}
