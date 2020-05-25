package behavioraldesignpatterns.interpretor;



public class InterpretorDemo {
    static Expression buildInterpretorTree(){
        //Expression terminal =null;
        Expression terminal =new TerminalExpression("Lions");
        Expression terminal1 =new TerminalExpression("Tigers");
        Expression terminal2 =new TerminalExpression("Bears");


        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal1,terminal2);

        //Lions (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal,alternation1);

        return new AndExpression(terminal2,alternation2);


    }
    /*
      Main method : Builds an interpretor and then interpret a specific sequence
     */
    public static void main(String[] args) {
        //String context ="Lions";
        //String context ="Tigers";
        //String context ="Bears";
        String context ="Lions Tigers";
        //String context ="Lions Bears";
        //String context ="Tigers Bears";

        Expression define =buildInterpretorTree();
        System.out.println(context + " is " + define.interpret(context));

    }
}
