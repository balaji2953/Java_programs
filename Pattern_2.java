public class Pattern_2
{
	public static void main(String args[])
	{
		int n=5;
		//int temp;		
		for(int i=1;i<=n;i++)
		{
		for(int s=i;s<n;s++)
		{
		System.out.print("  ");
		}
		for(int j=i;j>=1;j--)
		{
  		  System.out.print(j+" ");
		 }
		 System.out.println();
		 }
	}
}
		 
