package Secondpackage;

public class Loop {

	public static void main(String[] args) 
	
	{
		int m =100;
		for (int i =1; i<4;i++)//hour
		{
			System.out.println("we are inside the manin i loop");
			
			for ( int j = 11; j<14;j++)//minute
			{
				System.out.println("i ma inside the j Loop");
				
				for (int k =21; k < 24;k++)//second
				{
					
					System.out.println(m);
					m++;
					
				}
			}
			
			
			
			
		}

	}

}
