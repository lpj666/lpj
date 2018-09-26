package Test05;

public class Pad implements playGame {
    private String brand;
    private int price;

    public Pad() {
    }

    public Pad(String brand, int price) {

        this.brand = brand;
        this.price = price;
    }

    @Override
    public void playGame() {
        System.out.println("在使用"+this.price+"元"+this.brand+"手机玩游戏");
    }
    public void listenMusic(){
        System.out.println("在使用"+this.price+"元"+this.brand+"手机听音乐");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
