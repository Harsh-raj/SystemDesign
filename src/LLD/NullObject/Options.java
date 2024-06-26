package LLD.NullObject;

public enum Options implements Option{
    A("Option A"),
    B("Option B"),
    C("Option C"),
    D("Option D");
    private final String selectedOption;
    Options(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public String getSelectedOption(){
        return selectedOption;
    }
}
