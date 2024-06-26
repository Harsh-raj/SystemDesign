package LLD.Visitor.Element;

import LLD.Visitor.Visitor.StudentVisitor;

public class PGStudent implements StudentElement {

    private StudentVisitor studentVisitor;

    public PGStudent(StudentVisitor studentVisitor) {
        this.studentVisitor = studentVisitor;
    }

    @Override
    public void pay() {
        studentVisitor.payFees(this);
    }
}
