package assignment1;
import java.util.Scanner;

public class FlipCoin {
    public void flipCoinPercentage(String args){
        int heads = 0;
        int tails = 0;
        int flips = Integer.parseInt(args);
        int counter = 0;
        double randomNumber = 0.0;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        try {
            if (flips > 0) {
                while (counter < flips) {
                    randomNumber = Math.random();
                    if (randomNumber < 0.5)
                        heads = heads + 1;
                    else
                        tails = tails + 1;
                    counter++;
                }
                sb1.append("Probability of Heads percentage is : ").append((heads*100)/flips).append("%");
                sb2.append("Probability of Tails percentage is : ").append(( 100 - (heads*100)/flips)).append("%");

                System.out.println(sb1);
                System.out.println(sb2);
            } else {
                System.out.println("Please enter positive input");
            }
        }catch (Exception e){
            System.out.println("please enter integer only");
        }

    }
}

