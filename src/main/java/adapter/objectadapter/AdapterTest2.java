package adapter.objectadapter;

import adapter.classadapter.Mobile;
import adapter.classadapter.Voltage220;

public class AdapterTest2 {
    public static void main(String args[]) {
        System.out.println("===============对象适配器==============");
        VoltageAdapter2 voltageAdapter2 = new VoltageAdapter2(new Voltage220());
        Mobile mobile2 = new Mobile();
        mobile2.charging(voltageAdapter2);
    }
}
