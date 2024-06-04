package Visitor.Visitor;

import Visitor.Element.PGStudent;
import Visitor.Element.PHDStudent;
import Visitor.Element.StudentElement;
import Visitor.Element.UGStudent;

public interface StudentVisitor {
    void payFees(UGStudent ugStudent);
    void payFees(PGStudent pgStudent);
    void payFees(PHDStudent phdStudent);
}
