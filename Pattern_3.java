public class Pattern_3
{
	public static void main(String args[])
	{
		int n=5;
		int odd=-1,even=0;		
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
		if(i%2==1)
		{
		 odd+=2;
		 System.out.print(odd+" ");
		 }
		 else {
		 
		 even+=2;
		 System.out.print(even+" ");
		 }
		 }
		  System.out.println();
		  }
		  }}
		 
		 
