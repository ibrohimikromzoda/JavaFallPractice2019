package day21_whileLoops;

public class warmUp {
	public static void main(String[] args) {

		/*
		 * 1. write a java program that can count how many time the word "book" is
		 * appeared in a String Ex: input: I like books, I have books, I need book
		 * output: 3
		 */

		String sentence = "I like book, I have book, I need book, I buy book";
		// index: z
		int count = 0;
		for (int z = 0; z < sentence.length() - 3; z++) {
			if (sentence.substring(z, z + 4).equals("book")) {
				// 0, 4
				// 1, 5
				// 2, 6
				// ...
				// 16, 20 ==> 16, 19

				count++;
			}

		}

		System.out.println(count);

		String words = "Cybertek is school, Cybertek is great, I love Cybertek";
		// index: i, i+7
		// substring (i, i+7+1) ending index is excluded in substring
		int nTimes = 0;
		for (int i = 0; i < words.length() - 7; i++) {
			//
			if (words.substring(i, i + 8).equals("Cybertek")) {
				// i+7
				nTimes++;
				System.out.println(nTimes);
			}

		}

		/*
		 * Write a java prigram that can remove duplicated values from String ex : input
		 * : aabbcc output : abc
		 * 
		 */

		String s1 = "aabbcc";
		String result = ""; // abc // to store the new String value that does not have duplicates

		for (int i = 0; i < s1.length() - 1; i++) {
			if (!result.contains(s1.substring(i, i + 1))) {
				result += s1.substring(i, i + 1);
			}
		}
		System.out.println(result);

	}
}
