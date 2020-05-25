package structuraldesignpatterns.composite.finacialapp;

public class Client {
    public static void main(String[] args) {
        // Creating a Component tree
        Component component = new CompositeAccount(new AccountStatement());

        // Adding all accounts of a customer to component
        component.add(new DepositAccount("DA001",100));
        component.add(new DepositAccount("DA002",150));
        component.add(new DepositAccount("DA003",200));
        component.add(new DepositAccount("DA004",250));
        component.add(new SavingAccount("DA005",1000));

        // getting composite balance for customer
        float totalBalance = component.getBalance();
        System.out.println(" Total Balance : " + totalBalance);

        AccountStatement mergedStatment = component.getStatement();
       // System.out.println("Merged Statement : " + mergedStatment);
    }
}
