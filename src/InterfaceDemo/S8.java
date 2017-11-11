package InterfaceDemo;

public class S8 implements Phone,Rock {
    @Override
    public void charge() {
        System.out.println("s8正在充电");
    }

    @Override
    public void playGame() {
        System.out.println("用s8玩游戏");
    }

    @Override
    public void hit() {
        System.out.println("用s8砸核桃");
    }

    public void WirelessCharge(WirelessChargeInterface wirelessChargeInterface){
        wirelessChargeInterface.charge();
    }
}
