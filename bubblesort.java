public class bubblesort {
    public static void main(String[] args) {
            int arr[]={4,1,8,3,2};
            int size=arr.length;
            System.out.println("Before Swapping :");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }


            for(int i=1;i<size;i++)
            {
                for(int j=0;j<size-i;j++)
                {
                  if(arr[j]>arr[j+1])
                  {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                  }
                }
            }
            System.out.println("\n");
            System.out.println("After Swapping :");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }
