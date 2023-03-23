package org.arvinw.example10;

public class ComputerAdapter extends Computer implements TriplePin{
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
