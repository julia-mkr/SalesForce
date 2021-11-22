package objects;

public class Accounts {

    String accountName;
    String website;
    String industryType;
    String phone;
    String description;

    public Accounts(String accountName, String website, String industryType, String phone, String description) {
        this.accountName = accountName;
        this.website = website;
        this.industryType = industryType;
        this.phone = phone;
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }
}
