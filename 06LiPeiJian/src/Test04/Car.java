package Test04;

public class Car extends Automoblie implements Driving{
    public Car() {
    }

    public Car(String brand, String certificate) {
        super(brand, certificate);
    }

    @Override
    public void running() {
        System.out.println("品牌为"+this.getBrand()+"的车在广州城区跑");
    }

    void checkOM(){
        if(this.getCertificate().equals("Yes")){
            System.out.println("有营业执照");
        }
        else {
            System.out.println("没有营业执照");
            running();
        }
    }
}
