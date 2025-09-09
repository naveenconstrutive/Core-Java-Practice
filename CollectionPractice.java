/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.stream.*;;
public class Main
{
	public static void main(String[] args) {
		//remove the duplicates from given list
		removeDuplicateFromGivenList();

		// remove Duplicates and sorted order FromGiven List with out using streams
		removeDuplicateFromGivenListAndSortedOrder();

		//remove Duplicates  order FromGiven List with out using streams
		removeDuplicateFromGivenListUsingSet();

		// sum of all integers
		sumOfAllIntegers();

		sumOfAllIntegersUsingStreams();

		// remove duplicates from given Map without using streams
		removeDuplicateFromGivenMap();

		//prime number programme
		primeNumber();
		
		// given string balanced parathasis or not
		balancedParanthasis();
		



	}

	private static void removeDuplicateFromGivenList() {
		List<String> list = List.of("banana", "apple", "orange", "banana", "orange","apple");

		List<String> newList = list.stream()
		                       .distinct()
		                       .sorted()
		                       .collect(Collectors.toList());
		System.out.println("new List out put :" + newList);


	}

	private static void removeDuplicateFromGivenListAndSortedOrder() {
		List<String> list = List.of("banana", "apple", "orange", "banana", "orange","apple");
		Set<String> set = new TreeSet<>(list);
		List<String> newList = new ArrayList<>(set);
		System.out.println("sorted set : " + set);
		System.out.println("list after removal duplicates :" + newList);
	}

	private static void removeDuplicateFromGivenListUsingSet() {
		List<String> list = List.of("banana", "apple", "orange", "banana", "orange","apple");
		Set<String> set = new HashSet<>();
		List<String> newList = new ArrayList<>();
		for(String word : list) {
			if(set.add(word)) {
				newList.add(word);
			}
		}
		System.out.println("after removal of duplicates:" + newList);
	}

	private static void sumOfAllIntegers() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i =0; i< arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("sum of all integers: "+sum);
	}

	private static void sumOfAllIntegersUsingStreams() {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		Integer sumOfAll = list.stream().reduce(0,Integer::sum);
		System.out.println("sum of all values: " + sumOfAll);

		int sumOfAllValues1 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of all values with int: "+sumOfAllValues1);
	}

	private static void removeDuplicateFromGivenMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("banana",5);
		map.put("orange",3);
		map.put("apple", 10);
		map.put("banana",4);
		map.put("orange",3);
		map.put("apple", 10);

		Map<String, Integer> distinctMap = new LinkedHashMap<>();
		for(Map.Entry<String,Integer> newMap : map.entrySet()) {
			distinctMap.putIfAbsent(newMap.getKey(), newMap.getValue());
		}

		System.out.println("removed duplicates :" + distinctMap);

	}

	private static void primeNumber(){
	    int number = 10;
	    boolean isPrime = true;
	
	        for(int i =2; i< Math.sqrt(number); i++){
	            if(number % i == 0){
	                isPrime =false;
	                break;
	                
	            }
	        }
	        
	        if(isPrime){
	        System.out.println("given number is prime number :" + number);
	        }
	        else{
	            System.out.println("given number is not a prime number :" + number);
	        }

	    
	}
	
	private static void balancedParanthasis(){
	    Map<Character, Character> map = Map.of('}', '{', ']', '[', ')', '(');
	    String givenParanthasis = "()";
	    boolean isBalanced = true;
	    Stack<Character> stack = new Stack<>();
	    for(char ch : givenParanthasis.toCharArray()){
	        if(map.containsValue(ch)){
	            stack.push(ch);
	        }
	        else if(map.containsKey(ch)){
	            if(stack.isEmpty() || stack.pop()!= map.get(ch)){
	                isBalanced = false;
	                break;
	            }
	        }
	        
	    }
	    if(isBalanced && stack.isEmpty()){
	            System.out.println(" the given string is balanced paranthasis :" + givenParanthasis);
	        }
	        else{
	            System.out.println(" the given string is not  paranthasis :" + givenParanthasis);
	        }
	}


}