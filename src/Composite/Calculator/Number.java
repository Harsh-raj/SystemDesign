package Composite.Calculator;

import java.sql.SQLOutput;

public class Number implements ArithmeticExpression{

    public int number;

    public Number(int number){
        this.number = number;
    }

    @Override
    public int evaluate() {
        return this.number;
    }

    @Override
    public void display(){
        System.out.print(this.number);
    }
}
