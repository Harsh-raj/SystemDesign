package LLD.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class FormContext {
    private Map<String, String> formData;

    public FormContext() {
        formData = new HashMap<>();
    }

    public void setFieldValue(String fieldName, String value) {
        formData.put(fieldName, value);
    }

    public String getFieldValue(String fieldName) {
        return formData.get(fieldName);
    }
}
