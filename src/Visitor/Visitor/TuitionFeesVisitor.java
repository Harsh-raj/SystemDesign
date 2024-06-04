package Visitor.Visitor;

import Visitor.Element.PGStudent;
import Visitor.Element.PHDStudent;
import Visitor.Element.UGStudent;

public class TuitionFeesVisitor implements StudentVisitor{
    @Override
    public void payFees(UGStudent ugStudent) {
        System.out.println("Tuition Fees for UG Students is\tRs. 1,25,000");
    }

    @Override
    public void payFees(PGStudent pgStudent) {
        System.out.println("Tuition Fees for PG Students is\tRs. 28,000");
    }

    @Override
    public void payFees(PHDStudent phdStudent) {
        System.out.println("Tuition Fees for PHD Students is\tRs. 10,000");
    }
}
