package plans;

import interfaces.ExcessFee;
import interfaces.PlanType;

public class EmailFlexibleQuotaPlanType implements PlanType, ExcessFee {
    private final double price = 7.5;
    private final int limit = 2000;
    private final double perMailFee = 0.03;

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public double price() {
        return price;
    }


    @Override
    public double feePerUnit() {
        return perMailFee;
    }
}
