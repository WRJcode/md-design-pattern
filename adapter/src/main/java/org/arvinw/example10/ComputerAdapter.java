package org.arvinw.example10;

/**
 * 类适配器
 * @author wrjco
 *
 */
public class ComputerAdapter extends Computer implements TriplePin{
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l, n);
    }
}
