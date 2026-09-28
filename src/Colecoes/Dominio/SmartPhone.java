package Colecoes.Dominio;

import java.util.Objects;

public class SmartPhone implements Comparable<SmartPhone>{
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



    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return serialNumber == that.serialNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, name);
    }

    @Override
    public int compareTo(SmartPhone o, SmartPhone o2) {
        if(o.serialNumber < o2.serialNumber) return -1;
        if(o.serialNumber > o2.serialNumber) return 1;
        return 0;
    }
}
