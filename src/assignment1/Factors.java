package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public void primeFactors(String args){

        ArrayList<String> arraylist = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        try {
            if (Integer.parseInt(args) > 2) {
                for (int indexNumber = 2; indexNumber <= (Integer.parseInt(args) - 1); indexNumber++) {
                    if (Integer.parseInt(args) % indexNumber == 0 && isPrimeNumber(indexNumber) ) {
                        arraylist.add(String.valueOf(indexNumber));
                    }
                }

                if(arraylist.size() == 0){
                    sb.append(args).append(" have no Prime factors.");
                    System.out.println(sb);
                }else{
                    System.out.println(arraylist);
                }

            } else {
                System.out.println("please enter a number above two.");
            }
        }catch (Exception e){
            System.out.println("Please enter integer only");
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

