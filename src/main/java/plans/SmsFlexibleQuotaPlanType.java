package plans;

import interfaces.ExcessFee;
import interfaces.PlanType;

public class SmsFlexibleQuotaPlanType implements PlanType, ExcessFee {
    private final double price = 30;
    private final int limit = 2000;
    private final double perSmsFee = 0.1;

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
    return perSmsFee;
    }
}
