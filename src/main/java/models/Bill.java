package models;

public class Bill {
    private Company company;
    private double amount = 0; // amount of bill
    private int notPaidBills = 0; // not paid bills. If it is bigger than 2 user will be in blacklist

    public int getNotPaidBills() {
        return notPaidBills;
    }

    public void setNotPaidBills(int notPaidBills) {
        this.notPaidBills = notPaidBills;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    // in every payment amount of bill is increasing
    public void increaseAmount(double amount){
        this.amount += amount;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
