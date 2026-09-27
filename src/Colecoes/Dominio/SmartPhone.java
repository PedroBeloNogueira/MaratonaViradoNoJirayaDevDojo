package Colecoes.Dominio;

public class SmartPhone {
    private long serialNumber;
    private String name;

    public SmartPhone(String name, long serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
