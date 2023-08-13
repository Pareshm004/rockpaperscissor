import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors:");
        Scanner sc = new Scanner(System.in);
        int manualInput = sc.nextInt();

        Random random = new Random();
        int compInput = random.nextInt(3);
        if (manualInput == compInput){
            System.out.println("Draw");
        }else if (manualInput == 0 && compInput==2 || manualInput == 1 && compInput== 0 || manualInput ==2 && compInput==1){
            System.out.println("Congratulations, You Win!!!");
        }else{
            System.out.println("Computer Wins, better luck next time");
        }
        System.out.println("Computer choice was :" + compInput);
        System.out.println("Thankyou for playing.");
        }
    }
