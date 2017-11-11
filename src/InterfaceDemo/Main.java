package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        S8 s8 = new S8();
        s8.charge();
        s8.hit();
        Temp temp = new Temp();
        s8.WirelessCharge(temp);
    }
}

class Temp implements WirelessChargeInterface{
    @Override
    public void charge() {
        System.out.println("正在无线充电");
    }
}
