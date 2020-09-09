package models;
import interfaces.Language;
import interfaces.PlanType;
import languages.Turkish;

public class Company {
    private String name;
    private String phone;
    private String email;
    private PlanType emailPlan;
    private PlanType smsPlan;
    private Language language = new Turkish(); // default language is Turkish
    private int smsCount = 0;
    private int emailCount = 0;

    public Company(String name, String phone, String email, PlanType smsPlan, PlanType emailPlan) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.smsPlan = smsPlan;
        this.emailPlan = emailPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PlanType getEmailPlan() {
        return emailPlan;
    }

    public void setEmailPlan(PlanType emailPlan) {
        this.emailPlan = emailPlan;
    }

    public PlanType getSmsPlan() {
        return smsPlan;
    }

    public void setSmsPlan(PlanType smsPlan) {
        this.smsPlan = smsPlan;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    public int getEmailCount() {
        return emailCount;
    }

    public void setEmailCount(int emailCount) {
        this.emailCount = emailCount;
    }

    public void increaseEmailCount() {
        this.emailCount++;
    }
    public void increaseSmsCount() {
        this.smsCount++;
    }
}
