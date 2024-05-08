package project;

public class Basic {

	public static void main(String[] args) 
	{
		System.out.println("Question NO. 1 :- ");
	    System.out.println("Hello I am at Anudip Foundation .");
	    System.out.println();
	    

// 	    output:
// 	    Question NO. 1 :- 
// Hello I am at Anudip Foundation .


	    System.out.println("Question NO. 2 :- ");
	    byte b = 2 ;
	    System.out.println("Byte Data Type :- " + b);
	    short s = 34 ;
	    System.out.println("Short Data Type :- " + s);
	    int i = 5 ;
	    System.out.println("Integer Data Type :- " + i);
	    float f = 5.5f ;
	    System.out.println("Float Data Type :- " + f);
	    double d = 5.1432d ;
	    System.out.println("Double Data Type :- " + d);
	    long l = 143245678l;
	    System.out.println("Long Data Type :- " + l);
	    String[] student = {"madhu","ravi","savitri","neha","pooja"};
        System.out.println("String Array :- ");
        for(String name: student)
        {
       	    System.out.print(name + " ");
        }
        System.out.println("\n");

//         output:
//         Question NO. 2 :- 
// Byte Data Type :- 2
// Short Data Type :- 34
// Integer Data Type :- 5
// Float Data Type :- 5.5
// Double Data Type :- 5.1432
// Long Data Type :- 143245678
// String Array :- 
// madhu ravi savitri neha pooja 



		System.out.println("Question 3 :-");
		int num1 = 10 , num2 = 5 ;
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1+num2));
		System.out.println("Substraction of " + num1 + " and " + num2 + " is " + (num1-num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1/num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
        System.out.println();

//         output:
//         Question 3 :-
// Addition of 10 and 5 is 15
// Substraction of 10 and 5 is 5
// Division of 10 and 5 is 2
// Multiplication of 10 and 5 is 50



        System.out.println("Question 4 :- ");
        for(int x = 1 ; x <=10 ; x++)
        {
            System.out.print(x + " ");
        }
        System.out.println("\n");

//         output:
//         Question 4 :- 
// 1 2 3 4 5 6 7 8 9 10 



        System.out.println("Question 5 :- ");
        String[] name = {"madhu","ravi","savitri","neha","pooja"};
        System.out.println("five names in an Array :- ");
        for(String n : name)
        {
       	    System.out.print(n + " ");
        }
//         output:
//         Question 5 :- 
// five names in an Array :- 
// madhu ravi savitri neha pooja 

		// TODO Auto-generated method stub

	}

}
