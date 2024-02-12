import java.util.Scanner;

public class BalanceParagraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="sethu institute trecyhh sethu institute technology sethu institute of technology  sethu institute of technology sethu institute of technology sethu institute of technology";

        int starting, ending, screenLimit, i;

        System.out.println("Enter Screen Limit : ");
        screenLimit = sc.nextInt();
        starting = 0;
        ending = 0;
        i = 0;
        //System.out.println(str.length());
        while (i < str.length()) {
            
            
            if (i - starting >= screenLimit) {
           // System.out.println(starting+" "+ending);
                printpara(str, screenLimit, starting, ending);
                i = starting = ending + 1;
            }
            if(i==str.length()-1)
            {
            	ending=str.length();
           // 	System.out.println(starting+" "+ending);
                
                printpara(str, screenLimit, starting, ending);
            }
            if (str.charAt(i) == ' ') {
                ending = i;
            }

            i++;

        }
    }

    static void printpara(String str, int screenLimit, int starting, int ending) {
        int space = 0, underScore, temp, strlen;
        strlen = ending - starting;
        for (int i = starting; i < ending; i++) {
            if (str.charAt(i) == ' ')
                space++;
        }
        // System.out.println(space);
        underScore = screenLimit - strlen + space;
        // System.out.println(sp);
        temp = 0;
        for (int i = starting; i < ending; i++) {
            if (str.charAt(i) == ' ') {
                temp++;
                for (int j = temp; j <= underScore; j = j + space) {
                    System.out.print("_");
                }
                continue;

            }
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }

}
