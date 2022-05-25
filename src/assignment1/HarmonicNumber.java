package assignment1;

public class HarmonicNumber {
    public void nthHarmonicValue(String[] args){
        float harmonic = 1f;
        StringBuilder sb = new StringBuilder();

        try {
            if (Integer.parseInt(args[0]) > 0) {
                for(int indexNumber=2; indexNumber <= Integer.parseInt(args[0]); indexNumber++){
                    harmonic = harmonic + (1f/indexNumber);
                }

                sb.append("Harmonic value : ").append(harmonic);
                System.out.println(sb);

            } else {
                System.out.println("Enter positive integer only");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound");
        }catch (Exception e){
            System.out.println("enter Integer only");
        }
    }
}
