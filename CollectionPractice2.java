/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
		// largest sub String
		largestSubString();
		
		//remove duplicates from given map using merge ClassNotFoundException
		duplicatesRemovalUsingMap();
		
		// remove duplicates from given list and convert them to Array
		removeDuplicatesFromGivenList();
		
		// binary search programme
		binarySearchProgramme();
		
		getListOfEmployee();
		removeDuplicatesFromGivenEmployee(getListOfEmployee());
		
	}
	
	private static void largestSubString(){
	    String word = "abcdddc";
	    int left =0;
	    int maxLength = 0;
	    int start = 0;
	    int right;
	    Map<Character, Integer> map = new HashMap<>();
	    for(right =0; right< word.length()-1; right++){
	        char ch = word.charAt(right);
	       if(map.containsKey(ch)){
	           left = Math.max(left, map.get(ch)+1);
	       }
	       map.put(ch, right);
	       if(right-left+1 > maxLength){
	        maxLength = right-left+1;
	        start = left;
	    }
	    }
	    
	    
	    
	   String subString =   word.substring(start, start+maxLength);
	    System.out.println("sub string is :" +subString);
	}
	
	private static void duplicatesRemovalUsingMap(){
	    Map<String, Integer> map = new HashMap<>();
	    map.put("banana", 34);
	    map.put("apple", 5);
	    map.put("orange", 10);
	    map.put("banana", 20);
	    map.put("apple", 4);
	    map.put("orange", 11);
	    
	    map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
	    .collect(Collectors.toMap(
	        Map.Entry::getKey,
	        Map.Entry::getValue,
	        (oldValue, newValue) -> oldValue,
	        LinkedHashMap::new
	        )).entrySet().stream().forEach(v1-> System.out.println("key values are :" + v1.getKey() + " and " + v1.getValue()));
	        
	       
	    
	}
	private static void removeDuplicatesFromGivenList(){
	    int[] arr = {1,1,2,3,4,5,16,3,8,1,4};
	    Set<Integer> set = new HashSet<>();
	    for(int i =0; i< arr.length; i++){
	        set.add(arr[i]);
	    }
	    
	    int[] arr2 = set.stream().sorted().mapToInt(Integer::intValue).toArray();
	    
	    System.out.println("set values : "+Arrays.toString(arr2));
	}
	
	private static int binarySearchProgramme(){
	    int[] arr={1,2,3,4,5,6,7,8,9};
	    int target = 6;
	    int indexValue = Arrays.binarySearch(arr, target);
	    System.out.println("targeted index :" + indexValue);
	    
	    
	    int low = 0;
	    int high = arr.length-1;
	    while(low <= high){
	        int mid = low + (high-low)/2;
	        if(arr[mid] == target){
	            System.out.println("it's mached the the targer :" + mid);
	            break;
	        }
	        else if(target > arr[mid]){
	             low = mid+1;
	        }
	        else{
	            high= mid-1;
	        }
	        
	    }
	    return -1;
	    
	}
	
	private static List<Employee> getListOfEmployee() {
		List<Employee> empList = List.of(

		                             new Employee(10, "Naveen", "10000"),
		                             new Employee(10, "Naveen", "10000"),
		                             new Employee(07, "Abhi", "5000"),
		                             new Employee(03, "Chintu", "3000")

		                         );

		return empList;

	}
	
	private static void removeDuplicatesFromGivenEmployee(List<Employee> getListOfEmployee){
	    getListOfEmployee.stream().collect(
	        Collectors.toMap(
	            v1-> v1.getAge()  +"_"  + v1.getName(),
	            v2-> v2,
	            (old,newValue)-> newValue,
	            LinkedHashMap::new
	            )).values().stream().forEach(v3-> System.out.println("after duplicates removal :" +v3.getAge()+ " " + v3.getName() + " " +v3.getSalary()));
	    
	}

}



