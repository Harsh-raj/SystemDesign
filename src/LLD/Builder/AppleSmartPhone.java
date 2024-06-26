package LLD.Builder;

public class AppleSmartPhone extends SmartPhoneBuilder {
    @Override
    public SmartPhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public String toString_() {
        return "AppleSmartPhone{" +
                "'company='" + company + super.toString() +
                '}';
    }
}
