package behavioraldesignpatterns.strategy;

public abstract class ValidationStrategy {
    abstract boolean isValid(CreditCard creditCard);

    // Luhn algorithm for checking for validating credit card number

    // it takes every number doubles it takes the modulus by 10
    // and if the sum is zero its a valid credit card number
    protected boolean passesLuhn(String ccNumber){
        int sum =0;
        boolean alternate =false;
        for (int i = ccNumber.length()-1;i>=0; i--){
            int n = Integer.parseInt(ccNumber.substring(i,i+1));
            if(alternate){
                n*=2;
                if(n>9){
                    n=(n%10)+1;
                }
            }

            sum +=n;
            alternate=!alternate;

        }
        return (sum%10==0);

    }
}
