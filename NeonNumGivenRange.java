import java.util.Scanner;
public class NeonNumGivenRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Start,End,temp,i,Square;
            System.out.println("Enter Start Range :");
            Start = sc.nextInt();
            System.out.println("Enter End Range :");
            End = sc.nextInt();
            //System.out.println(Start+" "+End);
            for(i=Start+1;i<End;i++)
            {
                Square=i*i;
                //System.out.println(Square);
                temp=0;
                while(Square>0)
                {
                    temp+=Square%10;
                    Square/=10;
                }
                //System.out.println(temp+","+i*i);
                if(temp==i)
                    System.out.print(i+" ");

            }
            //sc.close();
        }
        

    }
}
