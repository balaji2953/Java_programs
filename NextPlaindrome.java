
import java.util.Scanner;
public class NextPlaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Input,temp,Sum;
        System.out.println("Enter Input :  ");
        Input=sc.nextInt();

        while(true)
        {
            temp=++Input;
            Sum=0;
            while(temp>0)
            {
                Sum=Sum*10+(temp%10);
                temp/=10;
            }
            //System.out.println(Sum+ " "+Input);
            if(Sum==Input)
            {
                System.out.println(Input);
                break;
            }

        }sc.close();
    }
}
