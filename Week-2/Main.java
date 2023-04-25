public class Main {
    public static void main(String[] args) {
        int principal = (int) NumberReader.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) NumberReader.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) NumberReader.readNumber("Period (Years): ", 1, 30);

        MortgageCalculator mortgageCalculator = new SimpleMortgageCalculator(principal, annualInterest, years);
        MortgagePrinter mortgagePrinter = new ConsolePrinter(mortgageCalculator);

        mortgagePrinter.printMortgage();
        mortgagePrinter.printPaymentSchedule();
    }
}
