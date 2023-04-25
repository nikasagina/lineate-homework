public interface MortgageCalculator {

    public static final byte MONTHS_IN_YEAR = 12;
    public static final byte PERCENT = 100;

    double calculateBalance(short numberOfPaymentsMade);

    double calculateMortgage();

    byte getYears();
}
