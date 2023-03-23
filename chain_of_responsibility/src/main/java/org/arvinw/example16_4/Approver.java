package org.arvinw.example16_4;

public abstract class Approver {

    protected String name;
    protected Approver nextApprover;

    public Approver(String name){
        this.name = name;
    }

    protected Approver setNextApprover(Approver approver){
        this.nextApprover =  approver;
        return this.nextApprover;
    }

    public abstract void approve(int amount);
}
