package com.packagename.ExceptionHandling;

class customExcp extends Exception{
	public customExcp(String str)
	{
		super();
	}
}
//propogation exception
class x{
	
	void human() throws Exception
	{
	throw new Exception("exception");	
	  //throw new java.io.IOException("device error");
	}
	void men() throws Exception
	{
	human();	
	}
	void women() throws Exception
	{
		try {
			men();
		}
		
	
	catch(Exception e)
	{
	System.out.println("exceptionn");	
	}
	}
}



public class ExceptionHandling {
	
	//customized exception
	void CustomizeException(String name) throws Exception{
	
		if(name=="hello")
		{
			System.out.println("valid");
		}
		else
		{
			throw new Exception("pre not valid");
		}

		
	}
	
	//preinitilized exception
	void CustomizeExceptionn(String name)
	{
		if(name=="hello")
		{
			System.out.println("valid");
		}
		else
		{
			throw new ArithmeticException("pre not valid");
		}
		
	}
	

	//propagation exception using throw key
   

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		x prop=new x();
		prop.women();
		
		
		ExceptionHandling  ce=new ExceptionHandling ();
		ce.CustomizeException("hello");
		ce.CustomizeExceptionn("hello");
		try {
		throw new customExcp("hello gone wrong");
			
		}catch (Exception e) {
			System.out.println("this got executed");
		}
		
		String a[]= {"harpreet","rajveer","manpreeet"};
		try {   
		   try {
			   //System.exit(0);
			   for(int i=0;i<a.length;i++)
			   System.out.println(a[i]);//for error change i to out of index number
			  //return null;
		      }
		   catch(ArithmeticException e){ System.out.println(e);}
		   catch (IndexOutOfBoundsException e) {System.out.println(e);;}
		   catch (NullPointerException e) {System.out.println(e); }
		  }
		   catch(Exception e)
		   {
			   System.out.println("the error is:"+e);
			  // return null;
		   }
		finally {
			System.out.println("this is final block");
			//return null;
		}

	}

}
