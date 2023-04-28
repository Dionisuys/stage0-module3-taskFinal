package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String numberString = String.valueOf(number);
        char first = numberString.charAt(0);
        char second = numberString.charAt(1);
        char third = numberString.charAt(2);
        char fourth = numberString.charAt(3);
        int result = (int) first + (int) second + (int) third + (int) fourth;
        System.out.println(result);
    }
}
