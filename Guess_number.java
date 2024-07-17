import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    public static void main(String[]args){
        int x = 0;
        int count =0;
        do { System.out.println("________lets play guess a number game !!!!!________");
            Random r = new Random();
            int num = r.nextInt(0,100);
            int choice=0;

            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("guess a number between 0 to 100");

                choice = sc.nextInt();
                if (choice > num) {
                    System.out.println("your choice is greater");
                    count++;
                } else if (choice < num) {
                    System.out.println(" your choice is lower");
                    count++;
                } else {
                    System.out.println(" you guess the right number ");
                    System.out.println("no. of guesses : " + count);
                }
            }while(num!=choice  && count <= 10);
            if (count>10){
                System.out.println("you exceed the maximum number of attempts :( ");
            }

            System.out.println("wanna play again :) if yes! press 1 else for EXIT :( press 0 ");
            x= sc.nextInt();
        }while(x==1);


    }
}

