import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int array[] = new int[8]; 
    	for(int i = 0; i<8;i++)
    	{
    		if(i == 0)
    		{
    			boolean  isWrongInput = true;
    			while(isWrongInput)
    			{
    				try
	    			{
	    				array[i] = Integer.parseInt(sc.next());
	    				isWrongInput = false;
	    			}
	    			catch(Exception e)
	    			{
	    				System.out.println("Please input a number");
	    			}	
    			}
    		}
    		else
    		{
    			boolean isWrongInput = true;
    			while(isWrongInput)
    			{
    				try
	    			{
	    				array[i] = Integer.parseInt(sc.next());
	    				isWrongInput = false;
	    			}
	    			catch(Exception e)
	    			{
	    				System.out.println("Please input a number");
	    			}	
    			}
    		}
    	}
	
	 	int odd = array.length-1;
    	int even = 0;
    	int evenCount = 0;
    	
    	while(even<odd)
    	{
    		while(array[even]%2 == 	0)
    		{
    			even++;
    			evenCount++;
    		}
    		while(array[odd]%2 == 1)
    		{
    			odd--;
    		}
    		if(even<odd)
    		{
    			int a = array[even];
    			array[even] = array[odd];
    			array[odd] = a;
    		}
    	}
    	
    	for(int i = 0; i<8;i++)
    	{
    		System.out.print(array[i] + " ");
    	}
    	System.out.println();
    	
    	for(int i = 0; i < evenCount;i++)
    	{
    		for(int j = i + 1; j < evenCount; j++)
    		{
    			if(array[i] > array[j])
	    		{
	    			int a = array[i];
	    			array[i] = array[j];
	    			array[j] = a;
	    		}
    		}
    	}
    	
    	for(int i = evenCount; i<8; i++)
    	{
    		for(int j = i + 1; j < 8; j++)
    		{
    			if(array[i] > array[j])
	    		{
	    			int a = array[i];
	    			array[i] = array[j];
	    			array[j] = a;
	    		}
    		}
    	}
    	
    	for(int i = 0; i<8;i++)
    	{
    		System.out.print(array[i] + " ");
    	}
    	
    }
}
