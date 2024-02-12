public class Pattern_1
{
	public static void main(String args[])
	{
		int n=5;
		int temp;		
		for(int i=1;i<=n;i++)
		{
		System.out.print(i+" ");
		temp=i;
		for(int j=n-1;j>n-i;j--)
		{
		  temp+=j;
  		  System.out.print(temp+" ");
		 }
		 System.out.println();
		 }
	}
}
		 
