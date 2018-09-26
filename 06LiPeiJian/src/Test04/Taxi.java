package Test04;

public class Taxi extends Automoblie implements Om,Driving {
    public Taxi() {
    }

    public Taxi(String brand, String certificate) {
        super(brand, certificate);
    }

    @Override
    public void running() {
        System.out.println("品牌为"+this.getBrand()+"的车在广州城区跑");
    }

    @Override
    public void carryPassengers() {
        System.out.println("品牌为"+this.getBrand()+"的车在广州城区载客");

    }

    public void checkOM(){
        if(this.getCertificate().equals("Yes")) {
            System.out.println("有营业执照");
            carryPassengers();
        }
        else {
            System.out.println("没有营业执照");
            running();
        }
    }
}
