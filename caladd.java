import java.util.Scanner;
public class caladd
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice, ch;
		Scanner sca=new Scanner(System.in);
		do
		{
			System.out.println("1. Add two numbers");
			System.out.println("2. Exit");
			System.out.println("Enter your choice : ");
			choice = sca.next().charAt(0);
			switch(choice)
			{
				case '1' : System.out.print("Enter two numbers : ");
					   a=sca.nextFloat();
					   b=sca.nextFloat();
					   res=a+b;
					   System.out.print("Result="+res);
					   break;
					   
				case '2' : System.exit(0);
					   break;
					   
				default : System.out.print("INVALID CHOICE");
					  break;
					  
			}
			System.out.print("\n----------------------------------------------------------------\n");
		}while(choice!=2);
	}
}
					   
					   
