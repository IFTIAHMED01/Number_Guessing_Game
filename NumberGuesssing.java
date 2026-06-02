import java.util.Scanner;
import java.util.Random;

public class NumberGuesssing {
    public static void main(String[] args) {
     Scanner eri = new Scanner(System.in);

     int i=0;
     do{
      System.out.print("Please guess the Number: ");

      int num = eri.nextInt();

      Random rd = new Random();
      int rand = rd.nextInt();
      System.out.println("Random Number: "+ rand);
     
      if (num==rand){
         System.out.println("Congratulations, you have guessed the correct number");
      }
      else if(num > rand){
         System.out.println("Too High");
         System.out.println("Please Try Again!");
      }
      else{
         System.out.println("Too Low");
         System.out.println("Please Try Again!");
      }
      i++;
     } while(i<3);

     System.out.println("Thank You for playing the Game!");
   }
}
