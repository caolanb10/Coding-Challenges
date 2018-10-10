import java.util.*;

public class Master2 {
	
	public static void main(String[] args)
	{
		String[] strings = {"hello world", "mastercard", "Top programmer", "HadlLfEWjFJ"};
		char[][] a = new char[strings.length][];
		for(int i = 0; i < strings.length; i++)
		{
			a[i] = strings[i].toCharArray();
		}
		
		//Arrays for storing reversed strings
		String[] revStrings = new String[strings.length];
		String[] revStringsR = new String[strings.length];
		
		//Iterative
		for(int i = 0; i < strings.length; i++)
		{
			revStrings[i] = stringReverser(a[i]);
			System.out.println(revStrings[i]);
		}
		
		//Recursive
		for(int i = 0; i < strings.length; i++)
		{
			revStringsR[i] = recursiveReverse(a[i]);
			System.out.println(revStringsR[i]);
		}
	}
	
	//Iterative implementation
	public static String stringReverser(char[] rev)
	{
		if(rev.length<=1) return new String(rev);
		int len = rev.length;
		if(len<=1) return null;
		char iterator;
		char[] reverseString = new char[len];
		for(int i = 0; i < len; i++)
		{
			iterator = rev[i];
			reverseString[len-1 - i] = iterator;
		}
		return new String(reverseString);
	}
	
	//Recursive implementation
	public static String recursiveReverse(char[] reverser)
	{
		int len = reverser.length;
		if(len<=1) return new String(reverser);
		char[] empty = new char[len];
		return new String(recur(reverser, empty, len));
	}
	
	public static char[] recur(char[] str, char[] theString, int pos)
	{
		System.out.println(Arrays.toString(theString));
		if(pos == 0) return theString;
		pos--;
		theString[(theString.length-1) - pos] = str[pos];
		return recur(str, theString, pos);
	}
}
