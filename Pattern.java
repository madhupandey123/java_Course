package project;

public class Pattern {


		public static void main(String[] args)
		{

			System.out.println("Q.1");
			  System.out.println();

		    for (int i = 1; i <= 3; ++i)
		    {
		      for (int j = 1; j <= i; ++j) 
		      {
		        System.out.print(j + " ");
		      }
		      System.out.println();
		    }
		    System.out.println();


		    //output:
//	 	    Q.1

	// 1 
	// 1 2 
	// 1 2 3 



		    System.out.println("Q.2");
		    System.out.println( );
		    for (int i = 4; i > 0; i--)
		    {

		       for (int j = 1; j <= 4; j++)
		       {

				      if (j <= i) 
				   {

				      System.out.print("* ");

				   }
		       }
			      System.out.println();
		    }
		    System.out.println();

		    output:

//	 	    Q.2

	// * * * * 
	// * * * 
	// * * 
	// * 


		    System.out.println("Q.3");
		    System.out.println();

		    for(int i=1;i<=4;i++)
		    {

			     for(int j=1;j<=i;j++)

			      {

			        System.out.print("*"+"");

			      }
			     System.out.println();
		    }
		    System.out.println();

//	 	    output:

//	 	    Q.3

	// *
	// **
	// *
	// **


		    System.out.println("Q.4");
		    System.out.println();
		    for (int i = 4; i > 0; i--) 
		    {
		        for (int j = i; j > 0; j--)
		        {
		          System.out.print(j);
		        }

		        System.out.println();
		      }
		    System.out.println();

//	 	    output:

//	 	    Q.4

	// 4321
	// 321
	// 21
	// 1


		    System.out.println("Q.5");
		    System.out.println();

		       int number = 1;
		        for (int row = 1; row <= 4; row++) 
		        {
		            for (int col = 1; col <= row; col++) 
		            {
		                System.out.print(number + " ");
		                number++;
		            }
		            System.out.println();
		        }


//	 	        output:

	// Q.5

	// 1 
	// 2 3 
	// 4 5 6 
	// 7 8 9 10 


			// TODO Auto-generated method stub

		}

	}
