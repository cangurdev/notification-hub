package payment;

import models.Bill;
import plans.EmailFlexibleQuotaPlanType;

public class FlexibleEmailPlanPayment {
    EmailFlexibleQuotaPlanType plan = new EmailFlexibleQuotaPlanType();
    public void flexiblePlanPayment(Bill bill){
        bill.increaseAmount(plan.feePerUnit());
    }
}
