import java.util.Scanner;

public class Main {
   //Declare a Scanner object
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      //Start Game
      startGame();

      //Finish Game
      System.out.println("\nThank you for plaing!");
   }

   //Putting methods here
   public static void startGame() {
      System.out.println(getUserName());

      //Game Logic
      do {

      } while (keepPlaying());


   }

   

   //Play on or not
   public static boolean keepPlaying() {
      System.out.println("(1) Play (2) Stop");
      String play = scanner.next();
      //the .equals method will return true or false
      return play.equals("1");
   }

   //Getting user name
   public static String getUserName() {
      System.out.println("Please enter your name: ");
      String name = scanner.next();
      return "Welcome " + name + " to the guess the number game!";
   }
}
