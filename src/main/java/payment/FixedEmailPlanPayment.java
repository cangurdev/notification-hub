package payment;

import models.Bill;
import plans.EmailFixedQuotaPlanType;

public class FixedEmailPlanPayment {
    EmailFixedQuotaPlanType plan = new EmailFixedQuotaPlanType();
    public void fixedEmailPlanPayment(Bill bill){
        bill.increaseAmount(plan.price());
        bill.getCompany().setEmailCount(0);
    }
}
