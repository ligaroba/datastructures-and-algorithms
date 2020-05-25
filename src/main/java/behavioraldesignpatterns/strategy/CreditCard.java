package behavioraldesignpatterns.strategy;

public class CreditCard {
    private String number;
    private String date;
    private String cvv;

    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy){
        this.strategy= strategy;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCvv() {
        return cvv;
    }

    public boolean isValid(){
        return strategy.isValid(this);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
