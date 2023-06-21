public class RewardValue {
    private final double value;
    private final double miles_to_cash = 0.035;

    public RewardValue(double cash)
    {
        this.value = cash;
    }
    public RewardValue(int miles)
    {
        this.value = convert_miles_to_cash(miles);
    }
    public int getMilesValue()
    {
        return (int)(this.value/miles_to_cash);
    }
    public double getCashValue()
    {
        return this.value;
    }

    public double convert_miles_to_cash(int miles)
    {
        return miles*miles_to_cash;
    }
}
