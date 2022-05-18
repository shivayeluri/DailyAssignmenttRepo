package assignment1;

public class PowerOfTwo {
    public void powerTwo(String[] args){
        int inputNumber = Integer.parseInt(args[0]);
        if(inputNumber > 1 && inputNumber <31){
            for(int index = 1 ; index <= inputNumber ; index++){
                System.out.println( "2 ^" + index + "= " + Math.pow(2,index));
            }
        }else{
            System.out.println("please enter value between 1 - 31");
        }
    }
}
