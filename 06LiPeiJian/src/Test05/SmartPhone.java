package Test05;

public class SmartPhone extends Phone implements playGame {
    public SmartPhone() {
    }

    public SmartPhone(String brand, int price) {
        super(brand, price);
    }

    @Override
    public void playGame() {
        System.out.println("在使用"+getPrice()+"元"+getBrand()+"手机玩游戏");
    }
}
