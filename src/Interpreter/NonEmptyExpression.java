package Interpreter;

public class NonEmptyExpression implements  ValidationExpression{

    private String fieldName;

    public NonEmptyExpression(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean interpret(FormContext context) {
        String value = context.getFieldValue(fieldName);
        return value != null && !value.isEmpty();
    }
}
