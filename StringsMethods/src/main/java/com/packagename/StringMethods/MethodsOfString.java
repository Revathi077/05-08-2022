package com.packagename.StringMethods;

import java.util.ArrayList;

public class MethodsOfString {
	public void charat()
	{
		String str="hello world";
		//char ch=str.charAt(4);
		int strlen=str.length();
		System.out.print("the char at 4 is"+str.charAt(4));
		System.out.println("the char at space is:"+str.charAt(5));
		//System.out.print("bounds exception:"+str.charAt(strlen+1));
		
		
		ArrayList<Character> ch=new ArrayList<Character>();
		ch.add('a');
		ch.add('A');
		ch.add('e');
		ch.add('i');
		ch.add('o');
		ch.add('u');
		ch.add('E');
		ch.add('I');
		ch.add('O');
		ch.add('U');
		for(int i=0;i<str.length();i++)
		{
		if(i%2==0)
		{
			
		} else
		{
			System.out.println("odd place characters:"+str.charAt(i));
		}
		}
		int count=0;
		//counting no of characters
		for(int j=0;j<strlen;j++)
		{
			/*if(str.charAt(j)=='o')
			{
				count++;
			}*/
			
		
		//System.out.print("count of o is"+count);
		//counting vowels
		
		char cc=str.charAt(j);
		
		 for(int i=0;i<ch.size();i++)
		 {
			if(cc==ch.get(i))
			{
				count++;
				System.out.println(cc);
			}
			 
		 }
		
		}
		System.out.print("count of is"+count);
	}

}
