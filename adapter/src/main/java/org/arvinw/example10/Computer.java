package org.arvinw.example10;

/**
 * 电器
 * @author wrjco
 *
 */
public class Computer implements DualPin{

    @Override
    public void electrify(int l, int n) {
        System.out.println("火线通电：" + l + ",零线通电："+n);
        System.out.println("电脑开机");
    }
}
