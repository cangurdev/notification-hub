package plans;

import interfaces.PlanType;

public class EmailFixedQuotaPlanType implements PlanType {

    private final double price = 10;
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
