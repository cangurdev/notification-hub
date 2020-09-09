package notification.channel;

import models.Bill;
import models.Company;
import payment.FixedEmailPlanPayment;
import validation.FixedEmailLimitValidation;

public class FixedEmail implements Channel{
    FixedEmailLimitValidation fixedEmailLimitValidation = new FixedEmailLimitValidation();
    FixedEmailPlanPayment fixedEmailPlanPayment = new FixedEmailPlanPayment();
    public void Send(Bill bill, String message) {
        try {
            fixedEmailLimitValidation.emailLimitValidation(bill.getCompany());
        } catch (Exception e){
            fixedEmailPlanPayment.fixedEmailPlanPayment(bill); // renewal plan
            System.out.println(e.getMessage());
        } finally {
            System.out.println(bill.getCompany().getLanguage().emailMessage() + message);
        }
    }
    @Override
    public void increaseCount(Company company) {
        company.increaseEmailCount();
    }
}
