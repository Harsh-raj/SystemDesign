package LLD.Composite.Calculator;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, Operation operation, ArithmeticExpression rightExpression){
        this.leftExpression = leftExpression;
        this.operation = operation;
        this.rightExpression = rightExpression;
    }
    @Override
    public int evaluate() {
        int val=0;
        switch (operation){
            case PLUS: val = this.leftExpression.evaluate() + this.rightExpression.evaluate();
            break;
            case MINUS: val = this.leftExpression.evaluate() - this.rightExpression.evaluate();
            break;
            case MULTIPLY: val = this.leftExpression.evaluate() * this.rightExpression.evaluate();
            break;
            case DIVIDE: val = this.leftExpression.evaluate() / this.rightExpression.evaluate();
            break;
        }
        return val;
    }

    public void display(){
        this.leftExpression.display();
        switch (operation){
            case PLUS:
                System.out.print(" + ");
                break;
            case MINUS:
                System.out.print(" - ");
                break;
            case MULTIPLY:
                System.out.print(" * ");
                break;
            case DIVIDE:
                System.out.print(" / ");
                break;
        }
        this.rightExpression.display();
    }
}