package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public void primeFactors(){
        int inputNumber = 0;
        boolean flag = true;

        ArrayList<String> arraylist = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter number ");
            inputNumber = sc.nextInt();

            if (inputNumber > 2) {
                for (int indexNumber = 2; indexNumber <= (inputNumber - 1); indexNumber++) {
                    if (inputNumber % indexNumber == 0) {
                        if (isPrimeNumber(indexNumber)) {
//                        System.out.println(indexNumber);
                            arraylist.add(String.valueOf(indexNumber));
                        }
                    }
                }
            } else {
                System.out.println("please enter a number above two.");
                flag = false;
            }
        }catch (Exception e){
            System.out.println("Please enter integer only");
            flag = false;
        }

        if (flag){
            if(arraylist.size() == 0){
                System.out.println(inputNumber+" have no prime factors." );
            }else {
                System.out.println(arraylist);
            }
        }
    }

    public boolean isPrimeNumber(int num){

        boolean flag = true;

        for(int index = 2 ; index <= (num/2) ; index++){
            if (num % index == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

