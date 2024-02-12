import java.lang.Math;
import java.util.Arrays;
public class Program_8 {

	public static void main(String[] args) {
		//int arr[]={10,25,35,24,16};
		int[] arr= {8,15,25,36,42};
        //int factorsodd[] = new int[5];
        //int factoreven[]=new int[5];
        int factorsArr[]=new int[5];
        
        for(int i=0;i<arr.length;i++)
        {
            int j=2;
            int fact=2;
            while(j<=Math.sqrt(arr[i]))
            {
                if(arr[i]%j==0)
                {
                    fact+=1;
                    if(arr[i]/j!=j)
                     fact+=1;
                }
                //if(fact%2==1)
                //	factorsodd
                factorsArr[i]=fact;
                j++;
            }
        }
        oddeven(factorsArr,arr);
//        for(int i:factorsArr)
//         System.out.print(i+" ");

	}
	
	
	 static void oddeven(int[] arr ,int[] arr1) {
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i+1;j<arr.length;j++)
	            {
	                if(isodd(arr[i]) && isodd(arr[j]))
	                {
	                    if(arr[i]>arr[j])
	                    {
	                        int temp=arr[i]; int temp1=arr1[i];
	                        arr[i]=arr[j];   arr1[i]=arr1[j];
	                        arr[j]=temp;     arr1[j]=temp1;
	                    }
	                }
	                else if(iseven(arr[i]) && isodd(arr[j]))
	                {
	                      int temp=arr[i];   int temp1=arr1[i];
	                        arr[i]=arr[j];   arr1[i]=arr1[j];
	                        arr[j]=temp;     arr1[j]=temp1;
	                }
	                else if(iseven(arr[i])&& iseven(arr[j]))
	                {
	                    if(arr[i]>arr[j])
	                    {
	                        int temp=arr[i];  int temp1=arr1[i];
	                        arr[i]=arr[j];    arr1[i]=arr1[j];
	                        arr[j]=temp;      arr1[j]=temp1;
	                    }

	                }
	                //System.out.println("\t\t"+Arrays.toString(arr));
	            }
	            //System.out.println("\t"+Arrays.toString(arr));
	            
	        }
	        System.out.println(Arrays.toString(arr));
	        System.out.println(Arrays.toString(arr1));
	    }
	    static boolean isodd(int num)
	    {
	        return num%2==1;
	    }
	    static boolean iseven(int num)
	    {
	        return num%2==0;
	    }
	}





