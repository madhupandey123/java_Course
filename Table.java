package project;

public class Table {

	private int marks;

    public Table(int marks) 
    {
        this.marks = marks;
    }
    public String getGrade()
    {
        if (marks >= 90 && marks <= 100) 
        {
            return "A";
        } 
        else if (marks >= 80 && marks < 90) 
        {
            return "B";
        } 
        else if (marks >= 70 && marks < 80)
        {
            return "C";
        } 
        else if (marks >= 60 && marks < 70)
        {
            return "D";
        } else 
        {
            return "F";
        }
    }

public static void main(String[] args)

{
	//1) Write a program to print months name using switch case

	System.out.println("  Q.1 ");


	int months =12;
	switch(months)
    {

	     case 1:
    	     System.out.println("January");
    	     break;
		 case 2:
		    	System.out.println("February");
		    	break;
		 case 3:
		    	System.out.println("March");
			    break;
		 case 4:
			   System.out.println("April");
			    break;
		  case 5:
			   System.out.println("May");
			    break;
		  case 6:
			   System.out.println("June");
			    break;
		  case 7:
			   System.out.println("July");
			    break;
		  case 8:
			   System.out.println("August");
			    break;
		  case 9:
			   System.out.println("Septembher");
			    break;
		  case 10:
			   System.out.println("October");
			    break;
		  case 11:
			   System.out.println("Novembher");
			    break;
		  case 12:
			   System.out.println("December");
			    break;
		default :
			    System.out.println("Enter proper day");



    }

//	    output:

//	      Q.1 
//December

	System.out.println("  Q.2 ");
	int sum=42;
	for(int i =1;i<=10;i++)
	{
		System.out.println("42  X " + i + "=" +sum*i);

	}
//		output:
//		  Q.2 
//42  X 1=42
//42  X 2=84
//42  X 3=126
//42  X 4=168
//42  X 5=210
//42  X 6=252
//42  X 7=294
//42  X 8=336
//42  X 9=378
//42  X 10=420

	System.out.println("  Q.3 ");
	System.out.println("  \n ");

	  Table marks = new Table(90);
        System.out.println("Grade: " + marks.getGrade());





        System.out.println("  \n ");

//	        output:
//	        Q.3 


//Grade: A



	System.out.println("  Q.4 ");

	for(int i=1;i<=20;i++)
	{
		if(i==10)
		{
			continue;
		}
		if(i==15)
		{
			break;
		}
		System.out.println(i);
	}

//		output:

//		  Q.4 
//1
//2
//3
//4
//5
//6
//7
//8
//9
//11
//12
//13
//14

	System.out.println("  Q.5 ");
	 for(char m='a';m<='z';m++)
	 {
		 System.out.println(m+" ");
	 }
	 for(char s='A';s<='Z';s++)
	 {
		 System.out.println(s +" ");
	 }

//		output:

//		Q.5 
//a 
//b 
//c 
//d 
//e 
//f 
//g 
//h 
//i 
//j 
//k 
//l 
//m 
//n 
//o 
//p 
//q 
//r 
//s 
//t 
//u 
//v 
//w 
//x 
//y 
//z 


//A 
//B 
//C 
//D 
//E 
//F 
//G 
//H 
//I 
//J 
//K 
//L 
//M 
//N 
//O 
//P 
//Q 
//R 
//S 
//T 
//U 
//V 
//W 
//X 
//Y 
//Z 


	// TODO Auto-generated method stub

	}

}
