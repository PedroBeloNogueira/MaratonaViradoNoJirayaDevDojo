package Colecoes.Test;

import Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2, "Naruto"));
        mangas.add(new Manga(5, "Dan da Dan"));
        mangas.add(new Manga(3, "Dragon Ball Z"));
        mangas.add(new Manga(1, "Nanatsu no Taizaikkk"));
        mangas.add(new Manga(4, "Olhos de Gato"));
        mangas.add(new Manga(0, "Suzume "));
        Collections.sort(mangas);
        System.out.println(Collections.binarySearch(mangas, new Manga(2, "Naruto")));

    }
}
