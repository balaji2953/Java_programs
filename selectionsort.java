 public class selectionsort {
    public static void main(String[] args) {
        int arr[]={4,1,8,3,2};
        int size=arr.length;

        System.out.println("Before Swapping :");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }

        for(int i=0;i<size-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<size;j++)
            {
           // System.out.println("ha"+ j);
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            if(i!=minIndex)
            {
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;                 
            }
        }
            System.out.println("\nAfter Swapping :");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }
            System.out.println("\n");
    }
    
}
