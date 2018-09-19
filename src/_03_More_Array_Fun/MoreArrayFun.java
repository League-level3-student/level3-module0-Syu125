package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun run = new MoreArrayFun();
		String[] s = new String[5];
		s[0] = "red";
		s[1] = "orange";
		s[2] = "yellow";
		s[3] = "green";
		s[4] = "blue";

		run.random(s);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static String sentence = "";

	static void arrays(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i == 4) {
				sentence += strings[i];
			} else {
				sentence += strings[i] + ", ";
			}
		}
		System.out.println(sentence);

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	static void reverse(String[] strings) {
		for (int i = 4; i >= 0; i--) {
			if (i == 0) {
				sentence += strings[i];
			} else {
				sentence += strings[i] + ", ";
			}
		}
		System.out.println(sentence);

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	static void alternate(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i == 4) {
				sentence += strings[i];
			} else if (i % 2 == 0) {
				sentence += strings[i] + ", ";
			}

		}
		System.out.println(sentence);

	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	static void random(String[] strings) {
		Random r = new Random();
		int count = 0;

		while (count < strings.length) {
			int index = r.nextInt(5);
			if (strings[index] != "blank") {
				System.out.println(strings[index]);
				strings[index] = "blank";
				count++;
			}

		}
		System.out.println(sentence);

	}
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
