package project;
import java.util.Scanner;
//public class Loops 
//{
//	
//		public static void main(String[] args) 
//
//		{
//			//Q,1,WAP to print numbers 50 to 1 in reverse in a single line using for loop
//			for(int i=50;i>=1;i--)
//			{
//				System.out.print(i +" ");
//			}
//
//			System.out.println("  ");
//
//
//	///output:
//	//50  49  48  47  46  45  44  43  42  41  40  39  38  37  36  35  34  33  32  31  30  29  28  27  26  25  24  23  22  21  20  19  18  17  16  15  14  13  12  11  10  9  8  7  6  5  4  3  2  1    
//
//			//Q.2.WAP to print numbers 50 to 1 in reverse in a single line using while loop 
//
//	     int j=50;
//	     while(j>=1)
//	     {
//	    	 System.out.print(j+ " ");
//	    	 j--;
//	     }
//	     System.out.println(" ");
//	     //output
//	//50  49  48  47  46  45  44  43  42  41  40  39  38  37  36  35  34  33  32  31  30  29  28  27  26  25  24  23  22  21  20  19  18  17  16  15  14  13  12  11  10  9  8  7  6  5  4  3  2  1    
//
//
//	    // Q.3.WAP to print numbers 50 to 1 in reverse in a single line using do while loop
//	     int sum=50;
//	     do
//	     {
//	    	 System.out.print(sum + " ");
//	    	 sum--;
//	     }while(sum>=1);
//	     System.out.println(" ");
//
//	     //output
//
//	//50  49  48  47  46  45  44  43  42  41  40  39  38  37  36  35  34  33  32  31  30  29  28  27  26  25  24  23  22  21  20  19  18  17  16  15  14  13  12  11  10  9  8  7  6  5  4  3  2  1    
//	     //Q.4 WAP to print multiplication table of number taken by user using while loop 
//	     Scanner sc = new Scanner(System.in);
//	      System.out.println("Enter a number :-"+ " ");
//	      int num = sc.nextInt();
//	      int result = 1;
//	      while(result<=10)
//	      {
//	    	  System.out.println(num + " x "+ result + " = "+ result*num);
//	    	  result++;
//
//	      }
	      //output

//	      Enter a number :- 
//	      25
//	      25 x 1 = 25
//	      25 x 2 = 50
//	      25 x 3 = 75
//	      25 x 4 = 100
//	      25 x 5 = 125
//	      25 x 6 = 150
//	      25 x 7 = 175
//	      25 x 8 = 200
//	      25 x 9 = 225
//	      25 x 10 = 250

	     //Q..5 WAP to print prime numbers from 1 to 100
	      public class PrimeNumbers {
	    public static void main(String[] args) {
	        System.out.println("Prime numbers from 1 to 100:");
	        printPrimes(2);
	    }

	    // Function to recursively print prime numbers from start to 100
	    public static void printPrimes(int num) {
	        if (num > 100) {
	            return;
	        }
	        if (isPrime(num)) {
	            System.out.print(num + " ");
	        }
	        printPrimes(num + 1);
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    //output
	   // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		}
	}

