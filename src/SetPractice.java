import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @param set is the Set to add items to
	 * @param values zero or more Strings to add to set
	 */
	public static void addAll(Collection<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		System.out.print("Adding:");
		for (String val: values ) {
			System.out.print(" " + val);
			set.add(val);
		}
		System.out.println();
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Collection<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()){
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		HashSet<String> hashSet = new HashSet<>();
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		System.out.println("-- Test HashSet --");
		testSet(hashSet);
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.

		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
		
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?

		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"

		// 6. Print the elements in the set.  Is the order same as before?

		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").



		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate?

		
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
		TreeSet<String> treeSet = new TreeSet<>();
		System.out.println("-- Test TreeSet --");
		testSet(treeSet);
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!

		// 10. Repeat again using TreeSet with a Comparator.
		TreeSet<String> treeSets = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("-- Test TreeSet with comparator --");
		testSet(treeSets);
	}
	public static void testSet(Collection<String> stringSet){
		System.out.println("Add animal: ");
		addAll(stringSet,"dog","ant","bird","elephant","cat");
		print(stringSet);
		stringSet.clear();
		System.out.println();
		System.out.println("Re add animal with different order: ");
		addAll(stringSet,"cat","elephant","bird","ant","dog");
		print(stringSet);
		System.out.println();
		System.out.println("\"Add duplicate items to the set\"");
		stringSet.add("cat");
		stringSet.add("dog");
		System.out.println("Set contains: ");
		print(stringSet);
		System.out.println();
	}
	public static void main(String[] args) {
		setExplorer();
	}
}
