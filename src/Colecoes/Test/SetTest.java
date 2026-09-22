package Colecoes.Test;

import Colecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    static void main() {
        Set<Manga> mangas = new HashSet<Manga>();
        mangas.add(new Manga(2, "Naruto", 1));
        mangas.add(new Manga(5, "Dan da Dan", 2));
        mangas.add(new Manga(3, "Dragon Ball Z",5));
        mangas.add(new Manga(1, "Nanatsu no Taizaikkk",5));
        mangas.add(new Manga(4, "Olhos de Gato",0));
        mangas.add(new Manga(0, "Suzume ", 0));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
