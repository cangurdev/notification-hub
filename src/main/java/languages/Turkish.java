package languages;

import interfaces.Language;

public class Turkish implements Language {
    @Override
    public String blackListMessage() {
        return "Karalistedesiniz";
    }

    @Override
    public String emailMessage() {
        return "Eposta gönderildi. Mesaj: ";
    }

    @Override
    public String smsMessage() {
        return "Sms gönderildi. Mesaj: ";
    }

    @Override
    public String fixedLimitExceedMessage() {
        return "Sabit Kota aşıldı. Yeni paket alınacak.";
    }

    @Override
    public String flexibleLimitExceedMessage() {
        return "Esnek kota aşıldı. Bu mesaj ücretlendirilecektir.";
    }
}
