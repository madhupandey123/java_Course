package project;

//public class Arguments 
//{
//	public static int mult(int a, int b)
//	{
//		return  a*b;
//	}
//
//	public static void main(String[] args)
//	{
//		System.out.println( Arguments .mult(10,30));
//		// TODO Auto-generated method stub
//
//	}
//
//}

//output:
//
//
//300

//Q.2Q. Create a method of type string , check if grades is greater than 80 return "Congratulations on getting grade A+" , else return "You need to work hard"

//code:
//package madhu;

//public class Grades 
//
//{
//
//	public static void main(String[] args) 
//
//	{
//
//		int grades =90;
//
//		System.out.println(printGradeMessage(grades));
//
//	}
//		public static String printGradeMessage(int grades) 
//
//	    {
//
//
//	        if (grades > 80) 
//		        {
//		            return "Congratulations on getting grade A+";
//		        } 
//	        else 
//		        {
//		            return "You need to work hard";
//		        }
//
//
//	    }
//
//}

////output:
////
////Congratulations on getting grade A+
//
//
////Q.3.Q. Create a method of type void , make any pattern in it by taking as argument and then print it.
//
////code:
////
////package madhu;

//public class Pattern1 
//
//{
//	public static void printPattern(int n) 
//	{
//	    for (int i = 1; i <= n; i++) 
//	    {
//	        for (int j = 1; j <= i; j++)
//	        {
//	            if (j % 2 == 0) 
//	            {
//	                System.out.print(0);
//	            }
//	            else 
//	            {
//	                System.out.print(1);
//	            }
//	        }
//	        System.out.println();
//	     }
//	    for (int i = n-1; i > 0; i--) 
//	    {
//	        for (int j = 1; j <= i; j++)
//	        {
//	            System.out.print(i);
//	        }
//	        System.out.println();
//	    }
//	}
//	public static void main(String[] args) 
//
//	{
//		 printPattern(5);
//		// TODO Auto-generated method stub
//
//	}
//
//}

//
////output:
////
////1
////10
////101
////1010
////10101
////4444
////333
////22
////1
//
//
////Q.4.Q. Create a method of all primitive type in java, call the methods and print the final output.
//
////code:
////
//package madhu;
//
public class Primitive 
{
//	//primitive data type--->>byte,int,float,char,long,double,boolean,short
//
//
//
	public static void main(String[] args) 
	{
		int intValue = intMethod();
        byte byteValue = byteMethod();
        short shortValue = shortMethod();
        long longValue = longMethod();
        char charValue = charMethod();
        float floatValue = floatMethod();
        double doubleValue = doubleMethod();
        boolean booleanValue = booleanMethod();

        System.out.println("int: " + intValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("long: " + longValue);
        System.out.println("char: " + charValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
    }

    public static int intMethod() {
        return 10;
    }

    public static byte byteMethod() {
        return (byte) 128;
    }

    public static short shortMethod() {
        return (short) 32767;
    }

    public static long longMethod() {
        return 9_223_372_036_854_775_807L;
    }

    public static char charMethod() {
        return 'A';
    }

    public static float floatMethod() {
        return 3.14159f;
    }

    public static double doubleMethod() {
        return 2.71828;
    }

    public static boolean booleanMethod() {
        return true;
    }
		// TODO Auto-generated method stub

	}

//
//output:
//
//int: 10
//byte: -128
//short: 32767
//long: 9223372036854775807
//char: A
//float: 3.14159
//double: 2.71828
//boolean: true