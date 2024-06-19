package Interpreter;

public class AndExpression implements  ValidationExpression{
    private ValidationExpression expr1;
    private ValidationExpression expr2;

    public AndExpression(ValidationExpression expr1, ValidationExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(FormContext context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
