import java.util.Scanner;

public class Pyramid {

    public static void main(String [] args)
    {
    	Scanner sc =new Scanner(System.in);
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows ;i++)
		{
			for(int j = rows - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }
}