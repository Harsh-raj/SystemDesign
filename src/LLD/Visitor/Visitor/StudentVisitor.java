package LLD.Visitor.Visitor;

import LLD.Visitor.Element.PGStudent;
import LLD.Visitor.Element.PHDStudent;
import LLD.Visitor.Element.UGStudent;

public interface StudentVisitor {
    void payFees(UGStudent ugStudent);
    void payFees(PGStudent pgStudent);
    void payFees(PHDStudent phdStudent);
}
