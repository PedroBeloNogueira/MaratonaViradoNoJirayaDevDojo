package Colecoes.Test;

import Colecoes.Dominio.SmartPhone;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<SmartPhone> smartPhones = new HashSet<>();
        smartPhones.add(new SmartPhone("Iphone", 11154));
        smartPhones.add(new SmartPhone("Xiaomi", 44527));
        smartPhones.add(new SmartPhone("Sansung", 11451));


        System.out.println(smartPhones);
    }
}
