package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String i:list) {
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0;i<list.size();i+=2) {
			System.out.println(list.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int i = list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0;i<list.size();i++) {
			char e = 'e';
			String word = list.get(i);
			for(int o = 0;o<word.length();o++) {
				if(word.charAt(o) == e) {
					System.out.println("\n" + word);
					break;
				}
			}
		}
	}
}
