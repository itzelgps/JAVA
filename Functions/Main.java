import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Introduce tu nombre:  " );
        String name = console.next();
        int cantidad = String.valueOf(name).length();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
        //TODO implement this code
    	System.out.println(name.length());
    	
    }

    private static void printNameCharacters( String name )
    {
        //TODO implement this code
    }


}