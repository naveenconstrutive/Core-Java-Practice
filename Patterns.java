/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Patterns
{
	public static void main(String[] args) {
	    /*
	    12345
	    12345
	    12345
	    12345
	    12345
	    */
		for(int row = 1; row <=5; row++){ //1
		    for(int column = 1; column <=5; column++){
		        System.out.print(column);
		    }
		    
		    System.out.println();
		}
		
		printAlphaBets();
		printAlphaBetsIncrement();
	}
	
	private static void printAlphaBets(){
	    /*
	    AAAAA
	    BBBBB
	    CCCCC
	    DDDDD
	    EEEEE
	    */
	    char a ='A';
	    for(int row = 1; row <=5; row++){
	        for(int column =1; column <=5; column++){
	            System.out.print(a);
	        }
	        a++;
	        System.out.println();
	    }
	}
	
	private static void printAlphaBetsIncrement(){
	    
	    /*
	    ABCDE
        ABCDE
        ABCDE
        ABCDE
        ABCDE
	    */
	    char a ='A';
	    for(int row = 1; row <=5; row++){
	        for(int column =1; column <=5; column++){
	            System.out.print(a++);
	        }
	        a ='A';
	        System.out.println();
	    }
	}
}
