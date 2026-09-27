package Colecoes.Test;

import Colecoes.Dominio.Manga;
import Colecoes.Dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;




class SmartPhoneCompare implements Comparator<SmartPhone>{

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        if(o1.getSerialNumber() < o2.getSerialNumber() ) return -1;
        if(o1.getSerialNumber() > o2.getSerialNumber() ) return  1;
        return 0;
    }
}
public class NavigableSetTeste {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartPhoneCompare());
            set.add(new SmartPhone("Nokia",234));
            System.out.println(set);
        System.out.println("------------------------");
        NavigableSet<Manga> mangas = new TreeSet<>();
            mangas.add(new Manga(2, "Naruto", 1));
            mangas.add(new Manga(5, "Dan da Dan", 2));
            mangas.add(new Manga(3, "Dragon Ball Z",5));
            mangas.add(new Manga(1, "Nanatsu no Taizaikkk",5));
            mangas.add(new Manga(4, "Olhos de Gato",0));
            mangas.add(new Manga(0, "Suzume ", 0));

            for(Manga manga : mangas){
                System.out.println(manga);
            }

        System.out.println("----------------------------");



    }

}
