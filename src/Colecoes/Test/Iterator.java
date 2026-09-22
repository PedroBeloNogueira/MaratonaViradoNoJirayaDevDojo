package Colecoes.Test;

import Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Iterator {
    static void main() {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2, "Naruto", 1));
        mangas.add(new Manga(5, "Dan da Dan", 2));
        mangas.add(new Manga(3, "Dragon Ball Z",5));
        mangas.add(new Manga(1, "Nanatsu no Taizaikkk",5));
        mangas.add(new Manga(4, "Olhos de Gato",0));
        mangas.add(new Manga(0, "Suzume ", 0));

        java.util.Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()) {
            Manga manga = iterator.next();
           if (manga.getQuantidade() == 0)
               iterator.remove();
        }
        Collections.sort(mangas);
        System.out.println(mangas);
    }
}
