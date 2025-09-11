/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class PrimeNumbersPractice
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		palindromeWithPrime();
		
		// 50 to 100 prime numbers and their sum
		rangeOfPrimeNumbersTheirSum();
		// swap two numbers
		swapThegivenNumbers();
		// add sum even numbers from array
		addSumOfEvenNumbersFromArray();
		
		factorialNumbers();
		
		fibananicSeries();
	}
	
	private static int palindromeCheck(){
	    Scanner sc = new Scanner(System.in);
	    int number =sc.nextInt();
	    int reversedNumber = 0;
	    int tempNumber = number;
	    while(number!=0){
	        reversedNumber = reversedNumber *10 + number%10;
	        number = number/10;
	        
	    }
	    
	    if(tempNumber == reversedNumber){
	        return tempNumber;
	    }
	    else{
	        return 0;
	    }
	}
	
	private static void palindromeWithPrime(){
	    int validPalindrome = palindromeCheck();
	    int count = 0;
	    for(int i =1; i<= validPalindrome; i++){
	        if(validPalindrome % i==0){
	            count++;
	        }
	    }
	    
	    if(count ==2){
	        System.out.println("given number is palindrome and prime :" + validPalindrome);
	    }
	    else{
	       System.out.println("given number is palindrome but not a  prime :" + validPalindrome); 
	    }
	}
	
	private static void rangeOfPrimeNumbersTheirSum(){
	    int countOfPrime = 0;
	    for(int i = 50;  i <= 100; i++){
	        int count = 0;
	        for(int j =1; j <= i; j++){
	            if(i%j ==0){
	                count++;
	            }
	        }
	        if(count ==2){
	                countOfPrime+= i;
	        }
	        
	        
	    }
	    
	    System.out.println("sum of prime number for the range between 50 to 100 is :" + countOfPrime);
	}
	
	private static void swapThegivenNumbers(){
	    int a = 10;
	    int b = 20;
	    int c = a;
	     a =b;
	     b = c;
	     
	 
	    System.out.println("a value is : " + a +  " and" + " b value is : " +b);
	    
	}
	
	private static void addSumOfEvenNumbersFromArray(){
	    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	    int sum =0;
	    for(int i = 0; i< arr.length; i++){
	        if(arr[i]%2 ==0){
	            sum+=arr[i];
	        }
	    }
	    
	    System.out.println("sum of the even numbers from given array :" + sum);
	}
	
	private static void factorialNumbers(){
	    int number =6;
	    if(number < 0){
	        System.out.println("there is no factorials for negative numbers");
	    }
	    
	    int factorialNumber = 1;
	    
	    for(int i =1; i<=number; i++){
	        factorialNumber*=i;
	    }
	    
	    System.out.println("the given number is : " + number + " and " + "factorial for this number is :" + factorialNumber);
	}
	
	private static void fibananicSeries(){
	    int number = 3;
	    int first =0; int second =1;
	    
	    for(int i =0; i <=number; i++){
	        int next = first + second;
	        first = second;
	        second = next;
	        System.out.println("number of iterations are :" + next);
	    }
	}
}
