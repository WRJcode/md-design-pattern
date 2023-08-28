package org.arvinw.example10;

/**
 * 类适配器
 * @author wrjco
 *
 */
public class TVAdapter extends TV implements TriplePin{
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(n,e);
    }
}
