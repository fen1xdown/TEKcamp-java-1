package java_1.collections;

import org.w3c.dom.Node;

import java.util.*;

public class CollectionsChallenges {

	static int[] listOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
	static String[] listTwo = {"this", "is", "an", "array"};
	static String[] states = {"Texas", "Oklahoma", "Louisiana", "Kansas"};
	static int[] nums = new int[]{1, 2, 3 ,4};
	static ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
	static LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("red", "purple", "blue", "gold"));
	static int val = 2;
	static int x = 5;
	static int i = 3;


	public static void main(String[] args) {
//		Complete the code challenges for the following static methods

		int match = findVal(val, arrList);
		System.out.println("find val return " + match);
		match = findVal(-1, arrList);
		System.out.println("find val return " + match);

		List newList = convertArrToList(listTwo);
		System.out.println(newList);

		Set newSet = listToSet(states);
		System.out.println(newSet);

		int added = addToList(x, arrList);
		System.out.println(added);

		removeFromList(x, arrList);
		System.out.println("removed " + x);

		int pos = insertIntoList(x, i, arrList);
		System.out.println(x +" was inserted at position " + pos);

		List<Integer> reversedList = reverseNums(arrList);
		System.out.println(reversedList);
		System.out.println("array was reversed");

		LinkedList<String> notReversedList = reverseLinkedList(linkedList, true);
		System.out.println(notReversedList);

//		LinkedList<String> isReversedList = reverseLinkedList(linkedList, false);
//		System.out.println(isReversedList);
	}


	static int findVal(int val, ArrayList<Integer> arrList) {
//		find a value in the input array list.  return it if found.  if not, return null
		System.out.println("*****************");
		Integer match = -1;
		if (arrList.contains(val)){
			match = val;
		};
		return match;

	}

	static List convertArrToList(String[] args) {
//		convert the array to a list and return it.
		System.out.println("*****************");
		List somelist = Arrays.asList(listTwo);
//			System.out.println(somelist);
		return somelist;
	}

	static Set<String> listToSet(String[] states) {
//		convert a list of US states to a set.  return the set.
		System.out.println("*****************");
		Set<String> newSet = new HashSet<String>();
		for (String x : states)
			newSet.add(x);
		return newSet;
	}

	static int addToList(int x, ArrayList<Integer> numList) {
		// add the x input to the array list.  return the value if succcessfully added.
		System.out.println("*****************");
		numList.add(x);
		System.out.println(numList);
		return x;
	}

	private static void removeFromList(int x, ArrayList<Integer> numList) {
		// remove the input parameter value x from the numList.
		System.out.println("*****************");
		numList.remove(new Integer(x));
		System.out.println(numList);
	}

	static int insertIntoList(int x, int i, ArrayList<Integer> numList) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.
		System.out.println("*****************");
		int pos = -1;
		if (i > numList.size()-1){
			numList.add(x);
			pos = numList.size()-1;
		} else {
			numList.add(i, x);
			pos = i;
		}
		System.out.println(numList);
		return pos;
	}

	static List<Integer> reverseNums(ArrayList<Integer> nums) {
		/*
		reverse the values of the nums list
		return the reversed array list
		*/
		System.out.println("*****************");
		Collections.reverse(nums);
		return nums;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		System.out.println("*****************");
		LinkedList<String> returnedList = null;
		ArrayList<String> list = new ArrayList<String>(linkedList);
		Collections.reverse(list);
		returnedList = new LinkedList<String>(list);

		return returnedList;
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> names) {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.
		return names;
	}

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	//Optional
	static Queue<Person> covidVaccineQueue(Person[] people) {
//		There is an Array of people looking to get the COVID-19 vaccine.  The vaccines are administered on a first-come, first-serve basis.  Sequence the order of people by age.  The most elderly people get placed first in the queue, with the youngest getting placed last in the queue.  Return the Queue of folks waiting to be vaccinated.

		return null;
	}

}
