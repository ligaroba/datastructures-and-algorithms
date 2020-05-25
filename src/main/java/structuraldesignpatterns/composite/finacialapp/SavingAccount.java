package structuraldesignpatterns.composite.finacialapp;

public class SavingAccount extends Component {
    private String accountNo;
    private float accountBalance;
    private AccountStatement currentStmt;

    public SavingAccount(String accountNo,float accountBalance){
        this.accountBalance=accountBalance;
        this.accountNo=accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }


    @Override
    public float getBalance() {
        return accountBalance;
    }

    @Override
    public AccountStatement getStatement() {
        return currentStmt;
    }
}
