package validation;

import exceptions.BlacklistException;
import models.Bill;

public class BlacklistValidation {
    public void blacklistValidation(Bill bill){
        if(bill.getNotPaidBills()>1){ // if company has more than 1 not paid bills then it will be in blacklist
            throw new BlacklistException(bill.getCompany().getLanguage().blackListMessage());
        }
    }
}
