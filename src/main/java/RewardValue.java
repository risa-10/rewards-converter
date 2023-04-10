public class RewardValue {
//    RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//    RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//    RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//    RewardValue must convert from miles to cash at a rate of 0.0035.

    private double num;
    public RewardValue (double input) {
        num = input;
    }
    public double getCashValue() {
        return num;
    }

    public double getMilesValue() {
        return Math.round(num / 0.0035);
    }

}
