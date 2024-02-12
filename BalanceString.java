oimport java.util.Scanner;
public class BalanceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str="Hello How Are You";
        int strlen=str.length();
        int screenLimit,space=0,sp,temp;  //sp- space with screenlimit
        //char sp=;

        System.out.println("Enter Screen Limit : ");
        screenLimit=sc.nextInt();
        for(int i=0;i<strlen;i++)
        {
            if(str.charAt(i)==' ')
                space++;
        }
        //System.out.println(space);
        sp=screenLimit-strlen+space;  
        //System.out.println(sp);
        temp=0;
        for(int i=0;i<strlen;i++)
        {
            if(str.charAt(i)==' ')
            {
                temp++;
                for(int j=temp;j<=sp;j=j+space)
                {
                    System.out.print("_");
                }
                continue;

            }
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
