package payment;

import models.Bill;
import plans.SmsFlexibleQuotaPlanType;

public class FlexibleSmsPlanPayment {
    SmsFlexibleQuotaPlanType plan = new SmsFlexibleQuotaPlanType();
    public void flexiblePlanPayment(Bill bill){
        bill.increaseAmount(plan.feePerUnit());
    }

}
