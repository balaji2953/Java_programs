// Import the Random class
import java.util.*;

public class RandomNumber {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //Create a new Random object                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    Random random = new Random();

    //Generate a random number between 0 (inclusive) and 6 (exclusive)
    int randomNumber = random.nextInt(6);

    // Add 1 to shift the range to 1 (inclusive) and 6 (inclusive)
    randomNumber += 1;

     // Print the random number
     System.out.println("Random number: " + randomNumber);
    scan.close();
}
}
