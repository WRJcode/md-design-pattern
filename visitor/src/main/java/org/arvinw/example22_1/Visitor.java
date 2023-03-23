package org.arvinw.example22_1;

public interface Visitor {

    public void visit(Candy candy);

    public void visit(Wine wine);

    public void visit(Fruit fruit);

}
