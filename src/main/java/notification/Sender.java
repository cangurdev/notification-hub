package notification;

import models.Bill;
import models.Company;
import notification.channel.Channel;
import validation.BlacklistValidation;

import java.util.List;

public class Sender {
    private final List<Channel> channels;
    private final Company company;
    private Bill bill;

    public Sender(Company company, Bill bill, List<Channel> channels) {
        this.channels = channels;
        this.company = company;
        this.bill = bill;
    }
    public void Send(String message) {
        BlacklistValidation blacklistValidation = new BlacklistValidation();
        for (Channel channel : this.channels) {
            try {
                blacklistValidation.blacklistValidation(bill);
                channel.Send(bill,message);
                channel.increaseCount(company);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
