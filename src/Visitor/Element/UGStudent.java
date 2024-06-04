package Visitor.Element;

import Visitor.Visitor.StudentVisitor;

public class UGStudent implements StudentElement{

    private StudentVisitor studentVisitor;

    public UGStudent(StudentVisitor studentVisitor) {
        this.studentVisitor = studentVisitor;
    }

    @Override
    public void pay() {
        studentVisitor.payFees(this);
    }
}
