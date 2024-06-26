package LLD.Visitor.Visitor;

import LLD.Visitor.Element.PGStudent;
import LLD.Visitor.Element.PHDStudent;
import LLD.Visitor.Element.UGStudent;

public class HostleFeesVisitor implements StudentVisitor{
    @Override
    public void payFees(UGStudent ugStudent) {
        System.out.println("Hostle Fees for UG Student is\tRs. 5000");
    }

    @Override
    public void payFees(PGStudent pgStudent) {
        System.out.println("Hostle Fees for PG Student\tRs. 3000");
    }

    @Override
    public void payFees(PHDStudent phdStudent) {
        System.out.println("Hostle Fees for PHD Student\tRs. 1000");
    }
}
