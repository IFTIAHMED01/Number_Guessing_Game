import java.util.Scanner;
import java.util.Random;

public class NumberGuesssing {
    public static void main(String[] args) {
     Scanner eri = new Scanner(System.in);

     System.out.print("Enter a number: ");

     int num = eri.nextInt();

     Random rd = new Random();
     int rand = rd.nextInt();
     System.out.println("Random Number: "+ rand);
     
     if(num > rand){
        System.out.println("Congratulations, you have won!");
     }
     else{
        System.out.println("Sorry, you have lost!");
     }
  }
}
