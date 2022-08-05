package com.packagename.javanewfeatures;

import java.util.function.BiFunction;

//1
interface human{
	void humanfood();
}
    class man{
	public static void eat()
	{
		System.out.print("hello men");
	}
	//2
}
    //internal interface
    class refthread{
    static 	void  rthread()
    	{
    		System.out.println("thread running...");
    	}
    }
    //3
    class arithmetic{
    	static int  add(int a, int b)
    	{
    		int c=a+b;
			return c;
    	}
    }
public class ReferenceMethod {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		human h=man::eat;
		h.humanfood();
		//2
		Thread t=new Thread(refthread::rthread);
		t.start();
	//3
		BiFunction<Integer,Integer,Integer> addresult=arithmetic::add;
		

	}

}
