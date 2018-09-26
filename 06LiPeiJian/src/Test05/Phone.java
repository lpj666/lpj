package Test05;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void call(String name){
        System.out.println("在使用"+this.price+"元"+this.brand+"手机给 "+name+"打电话");
    }
    public void sendMessage(String name){
        System.out.println("在使用"+this.price+"元"+this.brand+"手机给 "+name+"发短信");

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
