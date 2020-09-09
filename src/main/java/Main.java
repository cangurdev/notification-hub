import languages.English;
import models.Bill;
import models.Company;
import notification.Sender;
import notification.channel.FixedSms;
import notification.channel.FlexibleMail;
import plans.EmailFlexibleQuotaPlanType;
import plans.SmsFixedQuotaPlanType;
import plans.SmsFlexibleQuotaPlanType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create company object
        Company company4 = new Company("company4","444444444","company4@mail.com", new SmsFlexibleQuotaPlanType(),null);
        // set company4's language to english
        company4.setLanguage(new English());

        // create bill for company 4
        Bill bill = new Bill();
        bill.setCompany(company4);

        // create sender
        Sender sender = new Sender(company4,bill, Arrays.asList(new FixedSms()));

        // send sms 10 times
        for (int i = 0; i < 10; i++) {
            try {
                sender.Send("Damn");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        //create company object
        Company company3 = new Company("company3","444444444","company4@mail.com", new SmsFixedQuotaPlanType(),new EmailFlexibleQuotaPlanType());
        company3.setLanguage(new English());

        // create bill for company3
        Bill bill1 = new Bill();
        bill1.setCompany(company3);
        // set company3's bills not paid to 3 to see blacklist error
        bill1.setNotPaidBills(3);

        // create sender for company3
        Sender sender1 = new Sender(company3,bill1, Arrays.asList(new FixedSms(),new FlexibleMail()));

        // send sms and mail 13 times. Every time it will print "karalistedesiniz" because of bills not paid
        for (int i = 0; i < 13; i++) {
            try {
                sender1.Send("Selam");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        //create company object
        Company company2 = new Company("company3","444444444","company4@mail.com", new SmsFixedQuotaPlanType(),new EmailFlexibleQuotaPlanType());

        // create bill for company3
        Bill bill2 = new Bill();
        bill2.setCompany(company2);
        // set company3's bills not paid to 1.
        bill2.setNotPaidBills(1);

        // create sender for company2
        Sender sender2 = new Sender(company2,bill2, Arrays.asList(new FixedSms(),new FlexibleMail()));

        for (int i = 0; i < 2003; i++) {
            try {
                sender2.Send("Selam");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(company2.getEmailCount());
        System.out.println(bill2.getAmount());

    }
}
