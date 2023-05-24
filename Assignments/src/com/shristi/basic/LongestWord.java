package com.shristi.basic;
public class LongestWord 
{
	private static String findLongestWord(String sentence)
	{
		String[] words=sentence.split(" ");
		String longestWord="";
		for(String word : words)
		{
			if(word.length()>longestWord.length())
			{
				longestWord=word;
			}
		}
		return longestWord;
	}
		public static void main(String[] args) {
		String sentence="Hello Mohammed abrar";
		String longestWord=findLongestWord(sentence);
		System.out.println("longest word is :"+longestWord);
	}
}
