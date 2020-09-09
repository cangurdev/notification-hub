package validation;

import exceptions.FixedLimitExceedException;
import models.Company;

public class FlexibleEmailLimitValidation {
    public void flexibleEmailLimitValidation(Company company) {
        if (company.getEmailCount() > company.getEmailPlan().limit()) {
            throw new FixedLimitExceedException(company.getLanguage().flexibleLimitExceedMessage());
        }
    }
}
