package languages;

import interfaces.Language;

public class English implements Language {
    @Override
    public String blackListMessage() {
        return "You are in blacklist";
    }

    @Override
    public String emailMessage() {
        return "Send Email. Message: ";
    }

    @Override
    public String smsMessage() {
        return "Send Sms. Message: ";
    }

    @Override
    public String fixedLimitExceedMessage() {
        return "Fixed Limit exceed. New package will be bought";
    }

    @Override
    public String flexibleLimitExceedMessage() {
        return "Flexible Limit Exceed. This message will be charged.";
    }
}
