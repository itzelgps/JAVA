import java.util.Scanner;

public class Table {
	
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = in.nextInt();
	        
	        
	        while(num <= num) {
	        	System.out.println(num);
	        	num+=num;
	        }
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result
	    }
	}