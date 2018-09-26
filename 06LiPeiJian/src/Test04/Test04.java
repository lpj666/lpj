package Test04;

public class Test04 {
    public static void main(String[] args) {
        Taxi t=new Taxi("Audi","Yes");
        Car c=new Car("BMW","No");
        c.running();
        t.running();
        t.checkOM();
        c.checkOM();
    }
}
