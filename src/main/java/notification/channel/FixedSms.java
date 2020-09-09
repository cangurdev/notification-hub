package notification.channel;

import models.Bill;
import models.Company;
import payment.FixedSmsPlanPayment;
import validation.FixedSmsLimitValidation;

public class FixedSms implements Channel {
    FixedSmsLimitValidation fixedSmsLimitValidation = new FixedSmsLimitValidation();
    FixedSmsPlanPayment fixedSmsPlanPayment = new FixedSmsPlanPayment();
    public void Send(Bill bill, String message) {
        try {
            fixedSmsLimitValidation.smsLimitValidation(bill.getCompany());
        } catch (Exception e){
                fixedSmsPlanPayment.fixedPlanPayment(bill); // renewal plan
                System.out.println(e.getMessage());

        } finally {
            System.out.println(bill.getCompany().getLanguage().smsMessage() + message);
        }
    }
    @Override
    public void increaseCount(Company company) {
        company.increaseSmsCount();
    }
}
