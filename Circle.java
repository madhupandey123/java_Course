package project;

public class Circle 
{

	
	
		/*Create a class called circle . It contains:
		 *Two instance variables: radius (of the type double) and color (of the type String).
		 *One public methods: getArea(),simple Constructor  with default value of 1.0 and "red", and parameterized constructor.
		*/

			double radius;
			String color;

			public void getArea()
			{
				double area=3.14*radius*radius;
				System.out.println("Area of circle is : "+area);
				System.out.println("Color is :"+color);
				System.out.println("Radius is :"+radius);
			}

			public Circle()
			{  // Default Constructor
				this.radius = 1.0;
				this.color = "red";
			}

			  public Circle(double radius, String color)
			  { //Parameterized Constructor
				  super(); 
				  this.radius = radius;
			      this.color = color;

			 }


			  public static void main(String[]args) 
			  {
				Circle obj=new Circle(); //Object of Default Constructor
				obj.getArea();

				Circle obj1=new Circle(5,"Blue");  //Object of Parameterized Constructor & passing args
				obj1.getArea();
			 }


}	


//		Output :-
//		Area of circle is : 3.14
//		Color is :red
//		Radius is :1.0
//
//		Area of circle is : 78.5
//		Color is :Blue
//		Radius is :5.0
		/*Create a class GrandFather with methods name, property , physicalApperance. describe each properties of Grandfather in the class properly in the main method
		create Father class extending GrandFather and decribe each properties of father deriving from Grandfather(use Override annotation) in the main method 
		create Son class extending Father and decribe each properties of a Son deriving from Father(use Override annotation) in the main method 
		*/

//		package Inheritance_Lab;
//
//		public class Grandfather {
//			String name;
//			public void name(String name) {
//				this.name=name;
//				System.out.println("Name is: "+name);
//			}
//
//			public void property() {
//				System.out.println("Friendly Nature");
//				System.out.println("Animal Lover");
//			}
//
//			public void physicalApperance() {
//				System.out.println("Tall");
//				System.out.println("Muscular body");
//				System.out.println("Dark Skin");
//			}
//
//			public static void main(String[]args) {
//				Grandfather obj=new Grandfather();
//				obj.name(null);
//				obj.property();
//				obj.physicalApperance();
//			}
//
//		}
//
//		Output :-
//		Name is: null
//		Friendly Nature
//		Animal Lover
//		Tall
//		Muscular body
//		Dark Skin



//		package Inheritance_Lab;
//
//		public class Father extends Grandfather{
//
//			@Override
//			public void property() {
//				System.out.println("properties derived from Grandfather");
//				System.out.println("Friendly Nature");
//				System.out.println("Animal Lover");
//			}
//
//			public void propertyOfFather() {
//				System.out.println("properties of Father");
//				System.out.println("Nature Lover");
//				System.out.println("Strong Mindset");
//			}
//
//			public static void main(String[]args) {
//				Father obj=new Father();
//				obj.property();
//				obj.propertyOfFather();
//			}
//		}


//		Output :-
//		properties derived from Grandfather
//		Friendly Nature
//		Animal Lover
//		properties of Father
//		Nature Lover
//		Strong Mindset

//		package Inheritance_Lab;
//
//		public class Son extends Father{
//
//			@Override
//			public void property() {
//				System.out.println("properties derived from Grandfather");
//				System.out.println("Friendly Nature");
//				System.out.println("Animal Lover");
//			}
//
//			@Override
//			public void propertyOfFather() {
//				System.out.println("properties of Father");
//				System.out.println("Nature Lover");
//				System.out.println("Strong Mindset");
//			}
//
//			public void propertyOfSon() {
//				System.out.println("properties of Son");
//				System.out.println("Kind");
//				System.out.println("Hard working");
//			}
//
//			public static void main(String[]args) {
//				Son obj=new Son();
//				obj.property();
//				obj.propertyOfFather();
//				obj.propertyOfSon();
//			}
//		}

//		Output :-
//		properties derived from Grandfather
//		Friendly Nature
//		Animal Lover
//		properties of Father
//		Nature Lover
//		Strong Mindset
//		properties of Son
//		Kind
//		Hard working




		// Demonstrate the example of Single, hierarchical inheritance using shapes as a base class.
//		package Inheritance_Lab;
//
//		public class Shape { // Base class
//
//			public void area(int length,int breadth) {
//				int area=length*breadth;
//				System.out.println("Area is :"+area);
//			}
//		}

//		package Inheritance_Lab;
//
//		public class Rectangle extends Shape { // class Rectangle extends Class Shape.                    
//		                                       //Parent class:Shape 
//			                    // Child class: Rectangle. Here is single inheritance.
//
//			public static void main(String[]args) {
//				Rectangle r=new Rectangle();
//				r.area(4, 10);
//			}
//
//		}

//		Output :-
//		Area is :40


//		package Inheritance_Lab;
//
//		public class Square extends Shape { //class Square extends class Shape also 
//		                                    // class Rectangle extends Shape
//		                                    // Parent class : Shape
//			                                // Child classes: Square and Rectangle
//			                                // Here is Hierarchical inheritance.
//			public static void main(String[]args) {
//				Square s=new Square();
//				s.area(4, 4);
//			}
//		}
//
//		Output :-
//		Area is :16
		// TODO Auto-generated method stub

//	}
//
//}
