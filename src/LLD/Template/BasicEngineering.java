package LLD.Template;

public abstract class BasicEngineering {
    public final void displayCourseStructure() {
        courseOnMathematics();
        courseOnSoftSkills();

        courseOnSpecialPaper();
    }

    private void courseOnMathematics() {
        System.out.println("1. Mathematics");
    }

    private void courseOnSoftSkills() {
        System.out.println("2. Soft skills");
    }

    public abstract void courseOnSpecialPaper();
}
