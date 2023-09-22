package Secondpackage;

public class Guso2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int m =100;
		for (int i =1; i<4;i++)//hour
		{
			System.out.println("We are inside the manin i loop");
			
			for ( int j = 11; j<14;j++)//minute
			{
				System.out.println("I'm in a inside the j Loop");
				
				for (int k =21; k < 24;k++)//second
				{
					
					System.out.println(m);
					m++;
				}
			}
	}

	}
}
