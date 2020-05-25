package structuraldesignpatterns.composite.finacialapp;


public class CompositeAccount extends Component{
    private float totalBalance;
    private AccountStatement  individualStmt;
    private AccountStatement compositeStmt ;

    public CompositeAccount(AccountStatement accountStatement){
        this.compositeStmt=accountStatement;
    }

    @Override
    public float getBalance() {
        totalBalance =0;
        for(Component f : list ){
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    @Override
    public AccountStatement getStatement() {
       for(Component f : list){
           individualStmt = f.getStatement();
            compositeStmt.merge(individualStmt);
       }
       return compositeStmt;
    }
}
