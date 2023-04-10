public class RewardValue {
//    RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//    RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//    RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//    RewardValue must convert from miles to cash at a rate of 0.0035.

    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue (double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue (int milesValue) {
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

}
