package validation;

import exceptions.FixedLimitExceedException;
import models.Company;

public class FixedEmailLimitValidation {
    public void emailLimitValidation(Company company) {
        if (company.getEmailCount() > company.getEmailPlan().limit()) {
            throw new FixedLimitExceedException(company.getLanguage().fixedLimitExceedMessage());
        }
    }
}
