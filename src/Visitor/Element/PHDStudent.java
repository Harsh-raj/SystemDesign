package Visitor.Element;

import Visitor.Visitor.StudentVisitor;

public class PHDStudent implements StudentElement {
    private StudentVisitor studentVisitor;

    public PHDStudent(StudentVisitor studentVisitor) {
        this.studentVisitor = studentVisitor;
    }

    @Override
    public void pay() {
        studentVisitor.payFees(this);
    }
}
