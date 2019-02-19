import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game.");
        Random r = new Random();
        int high = 99;
        int low = 1;
        int n = r.nextInt(high - low) + low;
        System.out.println("Pick a number between 1 and 100");
        int userNum = -10;
        while (n != userNum){
            Scanner user = new Scanner(System.in);
            userNum = user.nextInt();
            if (userNum < n) {
              System.out.println("That number is to low");
            } else if (userNum > n) {
              System.out.println("That number is to high");
            } else {
              System.out.println("You Win");
            }
            
            
            
        }
    }
}
