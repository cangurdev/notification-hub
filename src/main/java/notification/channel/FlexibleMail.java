package notification.channel;

import models.Bill;
import models.Company;
import payment.FlexibleEmailPlanPayment;
import validation.FlexibleEmailLimitValidation;

public class FlexibleMail implements Channel {
    FlexibleEmailLimitValidation flexibleEmailLimitValidation = new FlexibleEmailLimitValidation();
    FlexibleEmailPlanPayment flexibleEmailPlanPayment = new FlexibleEmailPlanPayment();

    public void Send(Bill bill, String message) {
        try {
            flexibleEmailLimitValidation.flexibleEmailLimitValidation(bill.getCompany());
        } catch (Exception e) {
            flexibleEmailPlanPayment.flexiblePlanPayment(bill); // add excees fee to bill
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
