package assignment1;

import java.util.Scanner;

public class LeapYear {
    public void isLeapYear(String[] args){

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        try {
            if(Integer.parseInt(args[0]) > 0) {
                if (String.valueOf(Integer.parseInt(args[0])).length() == 4 ) {
                    if(((Integer.parseInt(args[0]) % 4 ==0 && Integer.parseInt(args[0]) % 100 !=0) || (Integer.parseInt(args[0]) %400 == 0))) {
                        sb1.append(Integer.parseInt(args[0])).append(" is leap year");
                        System.out.println(sb1);
                    }else{
                        sb2.append(Integer.parseInt(args[0])).append(" is not a leap year");
                        System.out.println(sb2);
                    }
                } else {
                    System.out.println("please enter four digit year ");
                }
            }else{
                System.out.println("please enter positive year");
            }
        }catch (Exception e){
            System.out.println("please enter year.");
        }
    }
}
