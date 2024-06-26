package LLD.Builder;

public class SamsungSmartPhone extends SmartPhoneBuilder {
    @Override
    public SmartPhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    @Override
    public String toString() {
        return "SamsungSmartPhone{" +
                "company='" + company + super.toString() +
                '}';
    }
}
