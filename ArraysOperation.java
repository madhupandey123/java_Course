package madhu;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOperation 
{

	public static void main(String[] args)
	{
//		Q1)WAP to perform subtraction of two matrices. 
//	    Q2)WAP to search a particular element in the given array.
//	    Q3)WAP to print array in descending order.
//	    Q4)Write a program on arrays to Read and Display all the array elements, find array length 
//	    Q5)Write a program to find the addition of two matrices using 2D array.
//	    Q6) Write a program to sort Array elements


		int num[]= {10,20,30,40,50,60,70,80,90,100};
		int num2[]={5,10,15,20,25,30,35,40,45,50};
		int subtraction[]=new int [num.length];
		for(int i=0;i<num.length;i++)
		{
			subtraction[i]=num[i]-num2[i];
		}
		for(int num3:subtraction)
		{
			System.out.print(num3+" ");
		}
		
		System.out.println("  ");
		
//	output:
//		
//		5 10 15 20 25 30 35 40 45 50   

		
		System.out.println("  ");
		 int arr[] = {2, 4, 1, 5, 7, 6, 9};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the element to search:-");
	        int toCheckValue = sc.nextInt();
	        boolean found = false;
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] == toCheckValue)
	            {
	                found = true;
	                break;
	            }
	        }
	        if (found) {
	            System.out.println("Element found");
	        } else {
	            System.out.println("Element not found");
	        }

	        System.out.println("  ");
//	        output:
//	        	  
//	        	Enter the element to search:-
//	        	10
//	        	Element not found
	        	  
	          

	        
	        int arr1[] = {2, 4, 1, 5, 7, 6, 9};
	        System.out.println("Array in descending order:");
	        for (int i = arr1.length - 1; i >= 0; i--)
	        {
	            System.out.print(arr1[i] + " ");
	        }
	        
	        System.out.println("  ");
//	        output:
//	        
//	        	Array in descending order:
//		        	9 6 7 5 1 4 2 
	        System.out.println("  ");
	        System.out.println("Enter the number of elements in the array:");
	        int n = sc.nextInt();
	        int array[] = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        System.out.println("Array elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println("\nArray length: " + array.length);
	        
	        System.out.println("  ");
//	        output:	        
//	        	  
//	        	Enter the number of elements in the array:
//	        	5
//	        	Enter the elements of the array:
//	        	4
//	        	5
//	        	3
//	        	2
//	        	1
//	        	Array elements:
//	        	4 5 3 2 1 
//	        	Array length: 5
	        	  

	        
	        System.out.println("Enter the number of rows and columns of the matrices:");
	        int r = sc.nextInt();
	        int c = sc.nextInt();
	        int first[][] = new int[r][c];
	        int second[][] = new int[r][c];
	        int sum[][] = new int[r][c];
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < r; i++) 
	        {
	            for (int j = 0; j < c; j++) 
	            {
	                first[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < r; i++) 
	        {
	            for (int j = 0; j < c; j++) 
	            {
	                second[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < r; i++) 
	        {
	            for (int j = 0; j < c; j++) 
	            {
	                sum[i][j] = first[i][j] + second[i][j];
	            }
	        }
	        System.out.println("Sum of the matrices:");
	        for (int i = 0; i < r; i++) 
	        {
	            for (int j = 0; j < c; j++) 
	            {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
//	        output: 
//	        
//	        	Enter the number of rows and columns of the matrices:
//	        		2 2
//	        		Enter the elements of the first matrix:
//	        		10 20
//	        		30 10
//	        		Enter the elements of the second matrix:
//	        		50 20
//	        		30 10
//	        		Sum of the matrices:
//	        		60 40 
//	        		60 20 

	        
	        System.out.println("Enter the number of elements in the array:");
	        int s = sc.nextInt();
	        int number[] = new int[s];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < s; i++) {
	            number[i] = sc.nextInt();
	        }
	        Arrays.sort(number);
	        System.out.println("Sorted array elements:");
	        for (int i = 0; i < s; i++) {
	            System.out.print(number[i] + " ");
	        }
//	        output:
//	        	
//	        	Enter the number of elements in the array:
//	        		4
//	        		Enter the elements of the array:
//	        		 2 4 2 4
//	        		Sorted array elements:
//	        		2 2 4 4 
		// TODO Auto-generated method stub
	        

	}

}
