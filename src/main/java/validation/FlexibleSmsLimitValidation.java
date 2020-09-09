package validation;

import exceptions.FixedLimitExceedException;
import models.Company;

public class FlexibleSmsLimitValidation {
    public void flexibleSmsLimitValidation(Company company) {
        if (company.getSmsCount() > company.getSmsPlan().limit()) {
            throw new FixedLimitExceedException(company.getLanguage().flexibleLimitExceedMessage());
        }
    }
}
