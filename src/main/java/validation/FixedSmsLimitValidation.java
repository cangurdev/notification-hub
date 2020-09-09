package validation;

import exceptions.FixedLimitExceedException;
import models.Company;

public class FixedSmsLimitValidation {
    public void smsLimitValidation(Company company) {
        if (company.getSmsCount() > company.getSmsPlan().limit()) {
            throw new FixedLimitExceedException(company.getLanguage().fixedLimitExceedMessage());
        }
    }
}
