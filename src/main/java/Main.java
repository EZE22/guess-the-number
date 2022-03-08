import java.util.Scanner;

public class Main {
   //Declare a Scanner object
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      //Start Game
      startGame();
//commment
      //Finish Game
      System.out.println("\nThank you for plaing!");
   }

   //Putting methods here
   public static void startGame() {
      System.out.println(getUserName());

      //Game Logic


   }

   //Getting user name
   public static String getUserName() {
      System.out.println("Please enter your name: ");
      String name = scanner.next();
      return "Welcome " + name + " to the guess the number game!";
   }
}
