package notification.channel;

import models.Bill;
import models.Company;
import payment.FlexibleSmsPlanPayment;
import validation.FlexibleSmsLimitValidation;

public class FlexibleSms implements Channel{
    FlexibleSmsLimitValidation flexibleSmsLimitValidation = new FlexibleSmsLimitValidation();
    FlexibleSmsPlanPayment flexibleSmsPlanPayment = new FlexibleSmsPlanPayment();
    public void Send(Bill bill, String message) {
        try {
            flexibleSmsLimitValidation.flexibleSmsLimitValidation(bill.getCompany());
        } catch (Exception e){
            flexibleSmsPlanPayment.flexiblePlanPayment(bill); // add excees fee to bill
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
