import java.util.Scanner;

public class LeapYear {
    public void isLeapYear(){

        int year = 0;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter year : ");
        try {
            year = sc.nextInt();
            if(year > 0) {
                if (String.valueOf(year).length() == 4 ) {
//                    if(((year % 4 ==0 && year % 100 !=0) || (year %400 == 0))) {
//                        flag = true;
//                    }
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                flag = true;
                            }else{flag = false;}
                        }else{flag = true;}
                    }else{flag = false;}
                } else {
                    System.out.println("please enter four digit year ");
                    flag = false;
                }
            }else{
                System.out.println("please enter positive year");
                flag = false;
            }
        }catch (Exception e){
            System.out.println("please enter integer input");
            flag = false;
        }

        if(flag){
            System.out.println(year +" is leap year.");
        }
        else{
            System.out.println(year +" is not leap year.");
        }
    }
}
