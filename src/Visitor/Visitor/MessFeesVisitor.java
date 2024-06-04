package Visitor.Visitor;

import Visitor.Element.PGStudent;
import Visitor.Element.PHDStudent;
import Visitor.Element.UGStudent;

public class MessFeesVisitor implements StudentVisitor{
    @Override
    public void payFees(UGStudent ugStudent) {
        System.out.println("Mess Fees for UG Students\tRs. 18000");
    }

    @Override
    public void payFees(PGStudent pgStudent) {
        System.out.println("Mess Fees for PG Student\tRs. 9000");
    }

    @Override
    public void payFees(PHDStudent phdStudent) {
        System.out.println("Mess Fees for PHD Student\tRs. 4000");
    }
}