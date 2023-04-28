package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int onesDigit = number % 10;
        int tensDigit = (number / 10) % 10;
        int hundredsDigit = number / 100;
        int reversedNumber = onesDigit * 100 + tensDigit * 10 + hundredsDigit;
        System.out.println("Reversed number: " + reversedNumber);
    }
}
