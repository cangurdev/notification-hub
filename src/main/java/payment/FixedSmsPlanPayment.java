package payment;

import models.Bill;
import plans.SmsFixedQuotaPlanType;

public class FixedSmsPlanPayment {
    SmsFixedQuotaPlanType plan = new SmsFixedQuotaPlanType();
    public void fixedPlanPayment(Bill bill){
        bill.increaseAmount(plan.price());
        bill.getCompany().setSmsCount(0);
    }
}
