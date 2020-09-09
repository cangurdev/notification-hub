package plans;

import interfaces.PlanType;

public class SmsFixedQuotaPlanType implements PlanType {

    private final double price = 20;
    private final int limit = 1000;

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public double price() {
        return price;
    }

}
