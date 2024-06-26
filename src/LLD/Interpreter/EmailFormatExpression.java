package LLD.Interpreter;

public class EmailFormatExpression implements ValidationExpression{
    private String fieldName;

    public EmailFormatExpression(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean interpret(FormContext context) {
        String value = context.getFieldValue(fieldName);
        return value != null && value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
