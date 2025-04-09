package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		Streams s = new Streams();
		s.StreamFromCollections();
		s.StreamFromStringsArrays();
		s.StreamFromIntegerArrays();
		s.SumOfAllNumbers();
		s.AverageOfAllNumbers();
		s.SquareOfEachNumber();
		s.FindEvenNumber();
		s.FindOddNumber();
		s.SortInAscendingOrder();
		s.SortInDescendingOrder();
		s.Smallest_2ndSmallestNumber();
		s.largest_2ndlargestNumber();
		s.printDuplicateNumbers_usingFrequency();
		s.printDuplicateNumbers_usingHashSet();
	}
	
	public void StreamFromCollections() {
		System.out.println("**** 1. Create a stream from a collection. ****");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(40);
		arr.add(60);
		arr.add(70);
		arr.add(90);
		System.out.println("Collection type is arraylist and elements are : "+ arr);
		System.out.println("After converting to stream :: ");
		arr.stream().forEach(n-> System.out.print(n + " "));
		System.out.println("\n-------------------------------------------------------------------");
	}

	public void StreamFromStringsArrays() {
		System.out.println("**** 2. Create a stream from a Strings array. ****");
		String name[] = {"Amit","Prachi","Ashwin","Dhoni"};
		
		System.out.println("Array elements are ::"+Arrays.toString(name));
		
		List<String> namesList = Arrays.asList(name);
		System.out.println("After converting to stream :: ");
		namesList.stream().forEach(n-> System.out.print(n+" "));
		System.out.println("\n-------------------------------------------------------------------");
	}
	
	public void StreamFromIntegerArrays() {
		System.out.println("**** 3. Create a stream from an Integer array. ****");
		int a[] = {10,20,30,40,50,60};
		System.out.println("Array elements are ::"+Arrays.toString(a));
		
		List<Integer> intList = Arrays.stream(a) 	//covert to instream
			.boxed()	//convert int to Integer
			.collect(Collectors.toList());
		System.out.println("After converting to stream :: ");
		intList.stream().forEach(n-> System.out.print(n+" "));
		System.out.println("\n-------------------------------------------------------------------");
	}

	public void SumOfAllNumbers() {
		System.out.println("**** 4. Sum of all numbers in an integer array ****");
		int arr[] = {10,20,30,40,50,60};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Optional<Integer> sum = intList.stream().reduce((a,b)->a+b);
		System.out.println("Sum of all numbers = "+sum.get());
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void AverageOfAllNumbers() {
		System.out.println("**** 5. Average of all numbers in an integer array ****");
		int arr[] = {10,20,30,40,50,60};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		double avg = intList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Average of all numbers = "+avg);
		System.out.println("-------------------------------------------------------------------");
	}

	public void SquareOfEachNumber() {
		System.out.println("**** 6. Square of each number in an integer array ****");
		int arr[] = {1,2,3,4,5,6};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> squareNumber = intList.stream().map(e-> e*e).collect(Collectors.toList());
		System.out.println("Square of each numbers = "+squareNumber);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void FindEvenNumber() {
		System.out.println("**** 7. Find Even number in an integer array ****");
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> evenNumber = intList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers = "+evenNumber);
		System.out.println("-------------------------------------------------------------------");
	}

	public void FindOddNumber() {
		System.out.println("**** 8. Find Odd number in an integer array ****");
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> oddNumber = intList.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("Even Numbers = "+oddNumber);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void SortInAscendingOrder() {
		System.out.println("**** 9. Sort in ascending order from an integer array ****");
		int arr[] = {23,56,12,32,10,78,99,67,18,70};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> ascendingList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order sorting  = "+ascendingList);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void SortInDescendingOrder() {
		System.out.println("**** 10. Sort in descending order from an integer array ****");
		int arr[] = {23,56,12,32,10,78,99,67,18,70};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> descendingList = intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order sorting  = "+descendingList);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void Smallest_2ndSmallestNumber() {
		System.out.println("**** 11. Smallest and 2nd Smallest number from an integer array ****");
		int arr[] = {23,56,12,32,10,78,99,67,18,70};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> ascendingList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order sorting  = "+ascendingList);
		Integer smallest = intList.stream().sorted().distinct().findFirst().get();
		Integer secondSmallest = intList.stream().sorted().distinct().skip(1).findFirst().get();
		Integer thirdSmallest = intList.stream().sorted().distinct().skip(2).findFirst().get();
		System.out.println("Smallest number = "+smallest);
		System.out.println("2nd Smallest number = "+secondSmallest);
		System.out.println("3rd Smallest number = "+thirdSmallest);
		System.out.println("-------------------------------------------------------------------");
	}

	public void largest_2ndlargestNumber() {
		System.out.println("**** 12. largest and 2nd largest number from an integer array ****");
		int arr[] = {23,56,12,32,10,78,99,67,18,70};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> ascendingList = intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order sorting  = "+ascendingList);
		Integer largest = intList.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
		Integer secondLargest = intList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		Integer thirdLargest = intList.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
		System.out.println("Largest number = "+largest);
		System.out.println("2nd Largest number = "+secondLargest);
		System.out.println("3rd Largest number = "+thirdLargest);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void printDuplicateNumbers_usingFrequency() {
		System.out.println("**** 13. Print duplicate numbers from an integer array using frequency ****");
		int arr[] = {1,3,4,6,7,1,3,6,8};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> duplicate = intList.stream().filter(e->Collections.frequency(intList,e)>1).distinct()
				.collect(Collectors.toList());
		System.out.println("Duplicate elements : "+duplicate);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void printDuplicateNumbers_usingHashSet() {
		System.out.println("**** 14. Print duplicate numbers from an integer array using Hash Set ****");
		int arr[] = {1,3,4,6,7,1,3,6,8};
		System.out.println("Array elements are ::"+Arrays.toString(arr));
		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		HashSet<Integer> duplicate = new HashSet<Integer>();
		Set<Integer> duplicateSet = intList.stream().filter(e->!duplicate.add(e)).collect(Collectors.toSet());
		
		System.out.println("Duplicate elements : "+duplicateSet);
		System.out.println("-------------------------------------------------------------------");
	}

}
