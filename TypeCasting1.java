package project;

public class TypeCasting1 {


		public static void main(String[] args) 
		{
			System.out.println("Q.1");
			System.out.println();
			byte b = 123;
			short s = 12764;
			int  i = 1232145;
			long l = 123253423l;
			float f = (float)b;
			System.out.println(f);
			float f1 = (float)s;
			System.out.println(f1);
			float f2 = (float)i;
			System.out.println(f2);
			float f3 = (float)l;
			System.out.println(f3);
			System.out.println();
			double d =(double)b;
			System.out.println(d);
			double d1 =(double)s;
			System.out.println(d1);
			double d2 =(double)i;
			System.out.println(d2);
			double d3 =(double)l;
			System.out.println(d3);
			System.out.println();
			double do1 = 12345678796666.3547658d;
			float lo1 =13425.43654765f;
			byte B = (byte)do1;

			System.out.println(b);
			int I = (int)do1;
			System.out.println(I);
			long L = (long)do1;
			System.out.println(L);

			short S = (short)do1;
			System.out.println(S);
			System.out.println();
			byte By = (byte)lo1;
			System.out.println(By);
			int In = (int)lo1;
			System.out.println(In);
			long Lo = (long)lo1;
			System.out.println(Lo);
			short Sh = (short)lo1;
			System.out.println(Sh);
			System.out.println();

		//	output:
//	 		Q.1

	// 123.0
	// 12764.0
	// 1232145.0
	// 1.23253424E8

	// 123.0
	// 12764.0
	// 1232145.0
	// 1.23153423E8

	// 123
	// 2147483647
	// 12345678796666
	// -1

	// 113
	// 13425
	// 13425
	// 13425

			System.out.println("Q.2");
			System.out.println();
			char charValue = 'A';
			int intValue = (int)charValue;
			System.out.println(intValue);
			System.out.println();
			intValue = charValue + 1; 
			System.out.println(intValue);
			System.out.println();
			intValue = (int) charValue+4;
			System.out.println(intValue);
			System.out.println();
			System.out.println();

		//	output:

//	 		Q.2

	// 65

	// 66

	// 69

			System.out.println("Q.3");
			System.out.println();
			for (char M ='A';M<='Z';M++)
			{
				System.out.print(M + " ");

			}
			System.out.println();
			for (char V ='a';V<='z';V++)
			{
				System.out.print(V + " ");

			}


		//	output:

//	 		Q.3

	// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
	// a b c d e f g h i j k l m n o p q r s t u v w x y z 
			// TODO Auto-generated method stub

		}

	}
