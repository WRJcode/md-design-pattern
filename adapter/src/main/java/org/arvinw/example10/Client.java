package org.arvinw.example10;

public class Client {

    /**
     *
     * @param args
     * 适配器模式：适配器模式涉及适配对象、适配器；有两种适配方式，对象适配器与类适配器
     * 应用技术：继承（泛化）、实现（实现）、依赖、（关联、聚合、组合）
     * 应用场景：
     */
    public static void main(String[] args) {


        //TriplePin triplePin = new TV();  //接口不兼容，报错类型不匹配

        //使用适配器
        DualPin dualPinDevice = new TV();
        TriplePin triplePinDevice = new Adapter(dualPinDevice);
        triplePinDevice.electrify(1,0,-1);

        DualPin dualPinComputer = new Computer();
        TriplePin triplePinComputer = new Adapter(dualPinComputer);
        triplePinComputer.electrify(1,0,-1);

        //类适配器
        TriplePin tvAdapter = new TVAdapter();
        tvAdapter.electrify(1,0,-1);

        TriplePin computerAdapter = new ComputerAdapter();
        computerAdapter.electrify(1,0,-1);
    }
}
