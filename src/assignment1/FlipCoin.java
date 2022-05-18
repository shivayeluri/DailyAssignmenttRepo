package assignment1;
import java.util.Scanner;

public class FlipCoin {
    public void flipCoinPercentage(){
        int heads = 0;
        int tails = 0;
        int flips = 0;
        int counter = 0;
        double randomNumber = 0.0;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter How many times you want flip");
            flips = sc.nextInt();

            if (flips > 0) {
                while (counter < flips) {
                    randomNumber = Math.random();
                    if (randomNumber < 0.5)
                        heads = heads + 1;
                    else
                        tails = tails + 1;
                    counter++;
                }
            } else {
                System.out.println("Please enter positive input");
                flag = false;
            }
        }catch (Exception e){
            System.out.println("please enter integer only");
            flag = false;
        }

        if (flag){
            System.out.println("Probability of Heads percentage is : "+(heads*100)/flips + "%");
            System.out.println("Probability of Tails percentage is : "+ ( 100 - (heads*100)/flips)+ "%");
        }
    }
}

