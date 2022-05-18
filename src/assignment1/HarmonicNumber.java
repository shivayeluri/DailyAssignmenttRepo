package assignment1;

import java.util.Scanner;

public class HarmonicNumber {
    public void nthHarmonicValue(){
        int inputNumber;
        float harmonic = 1f;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter harmonic series number : ");
            inputNumber = sc.nextInt();
            if (inputNumber > 0) {
                for(int indexnumber=2; indexnumber <= inputNumber; indexnumber++){
                    harmonic = harmonic + (1f/indexnumber);
                }
            } else {
                System.out.println("Enter positive integer only");
                flag = false;
            }
        }catch (Exception e){
            System.out.println("enter Integer only");
            flag= false;
        }

        if(flag){
            System.out.println(harmonic);
        }
    }
}
