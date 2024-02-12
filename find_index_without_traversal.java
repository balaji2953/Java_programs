import java.util.Scanner;
public class find_index_without_traversal{
    public static void main(String args[])
    {
        try (Scanner scan = new Scanner(System.in)) {
			int n,arr[],key,i,total=0;
			System.out.println("Enter Array Size");
			n=scan.nextInt();
			arr=new int[n];
			System.out.println("Enter Array Elements :\n");
			for(i=0;i<n;i++)
			{
			    arr[i]=scan.nextInt();
			    total+=arr[i];
			}
			System.out.println("Enter Key value to search: ");
			key=scan.nextInt();
			scan.close();
			i=0;
			while(i<n)
			{
			    if(total-key==total-arr[i])
			     break;
			    i++; 
			}
			System.out.println(i);  
		}
            
        
    }
}
