package com.packagename.JavaPrograms;

abstract class abscmethod{
	abstract void absprint();
	
}
 class fruits{
	 private  int no=10;
	 void print()
	 {
		 class apple{
			 void app()
			 {
				 System.out.println("iam apple"+no);
			 }
		 }
		 apple ap=new apple();
		 ap.app();
	 }
 }

public class ClasssInClass {
	class inclass{
			
		public void hello()
		{
			System.out.println("saying helloooo");
		}
	}

	private static inclass inclass;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruits fr=new fruits();
		fr.print();
		ClasssInClass cls=new ClasssInClass();
		ClasssInClass.inclass=cls.new inclass();
		inclass.hello();
		
		abscmethod abs=new abscmethod() {
			
			@Override
			void absprint() {
				// TODO Auto-generated method stub
				System.out.println("saying hello");
			}
		};
       abs.absprint();
	}

}
