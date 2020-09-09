package notification.channel;

import models.Bill;
import models.Company;

public interface Channel {
    void Send(Bill bill, String message);
    void increaseCount(Company company);
}
