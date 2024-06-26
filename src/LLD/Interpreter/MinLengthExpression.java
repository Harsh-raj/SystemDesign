package LLD.Interpreter;

public class MinLengthExpression implements ValidationExpression{
    private String fieldName;
    private int minLength;

    public MinLengthExpression(String fieldName, int minLength) {
        this.fieldName = fieldName;
        this.minLength = minLength;
    }

    @Override
    public boolean interpret(FormContext context) {
        String value = context.getFieldValue(fieldName);
        return value != null && value.length() >= minLength;
    }
}
