public class insertionsort {
    public static void main(String[] args) {
        int arr[]={4,1,8,3,9};
        int size=arr.length;
        int key;

        for(int i=1;i<size;i++)
        {
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=key;
        }
        System.out.println("\nAfter Swapping :");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }
            System.out.println("\n");
    }
    
}
