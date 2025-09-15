/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Employee> empList = getEmployeeData();
		
		int empMaxSalary = empList.stream().map(emp -> emp.getSalary()).mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("employee max salary is :" +empMaxSalary);
		
		//to get sum of salary
		int empSumSalary = empList.stream().map(emp1-> emp1.getSalary()).mapToInt(Integer::intValue).sum();
		System.out.println("sum of emp salary :" + empSumSalary);
		
		//remove duplicates from array
		removeDuplicatesFromArray();
		
		reverseTheGivenArray();
		
		findLargestElementFromGivenArray();
		
		findNonRepatedCharacterFromGivenString();
	}
	
	private static List<Employee> getEmployeeData(){
	    List<Employee> empList1 = new ArrayList<>();
	    empList1.add(new Employee(150000, "Naveen"));
	    empList1.add(new Employee(10000, "Bhanu"));
	    empList1.add(new Employee(20000, "Srikanth"));
	    return empList1;
	}
	
	private static void removeDuplicatesFromArray(){
	    int[] arr ={1,2,3,1,2,3,4,6};
	    for(int i =0; i < arr.length; i++){
	        boolean isDuplicate = false;;
	        for(int j = 0; j<i; j++){
	            if(arr[i] == arr[j]){
	                isDuplicate = true;
	                break;
	            }
	           
	        }
	        if(!isDuplicate){
	            System.out.print(arr[i]);
	           
	       }
	    }
	    
	}
	
	private static void reverseTheGivenArray(){
	    int[] arr = {1,2,3,4,5,6};
	    for(int i = arr.length-1; i >=0; i--){
	        System.out.print(arr[i]);
	        System.out.println();
	    }
	}
	
	
	private static void findLargestElementFromGivenArray(){
	    int[] arr = {1,2,3,4,5,6};
	    int largest =0;
	    int smallest =9;
	    for(int i = 0;  i< arr.length; i++){
	        if(arr[i] > largest){
	            largest = arr[i];
	        }
	        if(arr[i] < smallest){
	            smallest =arr[i];
	        }
	    }
	    
	    System.out.println("largest element from given array :" + largest);
	    System.out.println("largest element from given array :" + smallest);
	}
	
	private static void findNonRepatedCharacterFromGivenString(){
	    String name  = "naveen";
	    int[] arr = new int[256];
	    for(int i =0; i < name.length(); i++){
	        arr[name.charAt(i)]++;
	    }
	    
	    for(int i =0;  i < name.length(); i++){
	        /*if(arr[name.charAt(i)] ==1){
	             System.out.println("non repeated char :" +name.charAt(i) + " and " +arr[name.charAt(i)]);
	        }*/
	        if(arr[name.charAt(i)] > 0){
	            System.out.println(" char is :" +name.charAt(i) + " and count is : " +arr[name.charAt(i)]);
	        }
	        
	        arr[name.charAt(i)] =0;
	        
	    }
	}
}
