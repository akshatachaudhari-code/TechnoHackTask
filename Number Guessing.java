import java.util.*;
public class CodeSoftTask1 {
    public static void main(String args[]) {
        int min = 1;
        int max = 100;
        int guessNumber;
        double randomDouble = Math.random();
        int randomNumber = (int) (randomDouble * (max - min)) + min;
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag ==100)   
        {
            System.out.println("Enter the Number");
            guessNumber=sc.nextInt();
            if (guessNumber == randomNumber) {
                System.out.println("You have Guess Correct Number ");
                flag = 0;
            } else if (guessNumber > randomNumber) {
                System.out.println("Too High");
            } else if (guessNumber < randomNumber) {
                System.out.println("Too Low");
            } else {
                System.out.println("Entered Number is not between 1 to 100");
            }
        }
    }
}