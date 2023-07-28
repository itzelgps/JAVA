import java.util.Scanner;

public class forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe tu nombre: ");
        
		char nombre = (char) in.nextInt();
		
		for (int cont = 0; cont < nombre.length(); cont++) {
			if (cont==0) {
				System.out.println(cont);
			}//if
		}//for cont

	}

}
