package Test04;

public class Automoblie {
    private String brand;
    private String certificate;

    public Automoblie() {
    }

    public Automoblie(String brand, String certificate) {
        this.brand = brand;
        this.certificate = certificate;
    }

    public String getBrand() {
        return brand;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
